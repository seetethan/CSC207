package feed_interaction_use_case;

import DetailedFeedView.DetailedFeedViewModel;
import codesnippet.CodeSnippetRepoGateway;
import codesnippet.CodeSnippetRequestModel;
import codesnippet.CodeSnippetResponseModel;
import feed.FeedDSRepository;
import feed.FeedGatewayResponseModel;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class NextSnippetPresenter implements NextSnippetOutputBoundary{

    final FeedDSRepository repository;
    final CodeSnippetRepoGateway codeSnippetRepoGateway;
    private DetailedFeedViewModel viewModel;

    public NextSnippetPresenter(FeedDSRepository repository, CodeSnippetRepoGateway codeSnippetRepoGateway, DetailedFeedViewModel viewModel) {
        this.repository = repository;
        this.codeSnippetRepoGateway = codeSnippetRepoGateway;
        this.viewModel = viewModel;
    }

    @Override
    public void showNextSnippet(NextSnippetResponseModel responseModel) {
        FeedGatewayResponseModel feed = repository.load(responseModel.getFeedId());
        int current = feed.getCurr();
        List<String> SnippetIDs = feed.getSnippetIDs();
        List<String> SnippetLocations = new ArrayList<>();
        for(String s: SnippetIDs){
            CodeSnippetRequestModel codeSnippetRequestModel = codeSnippetRepoGateway.retrieve(parseInt(s));
            String location = codeSnippetRequestModel.getFileUrl();
            SnippetLocations.add(location);
        }
        viewModel.nextSnippet(SnippetLocations, current);
    }

    @Override
     public void prepareFailView(String message) {
        viewModel.reportFail(message);
    }
}
package codesnippet_presenter;

import ui.CodeSnippetViewInterface;

public class CodeSnippetPresenter implements CodeSnippetViewOutputBoundary {
        private final CodeSnippetViewInterface codeSnippetViewInterface;

        public CodeSnippetPresenter(CodeSnippetViewInterface codeSnippetViewInterface) {
            this.codeSnippetViewInterface = codeSnippetViewInterface;
        }

        @Override
        public void openList(int userId) {
            this.codeSnippetViewInterface.open(userId);
        }
}

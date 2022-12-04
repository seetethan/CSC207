package chat_use_case;

import chat.ChatRequestModel;

import java.io.IOException;

public interface EditMessageInputBoundary {
    void edit(int messageId, ChatRequestModel requestModel) throws IOException;
}
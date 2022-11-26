package chat;

import java.util.Date;

public class MessageRepoRequestModel {

    private int messageId;

    private String content;

    private int author;

    private int receiver;

    private Date sendTime;

    private Date lastEditTime;

    private boolean isMessageSeen;

    private boolean isDeleted;

    private boolean isEdited;

    private int replyId;

    public MessageRepoRequestModel(int messageId, String content, int author, int receiver, Date sendTime,
                                   Date lastEditTime, boolean isMessageSeen, boolean isDeleted, boolean isEdited,
                                   int replyId) {
        this.messageId = messageId;
        this.content = content;
        this.author = author;
        this.receiver = receiver;
        this.sendTime = sendTime;
        this.lastEditTime = lastEditTime;
        this.isMessageSeen = isMessageSeen;
        this.isDeleted = isDeleted;
        this.isEdited = isEdited;
        this.replyId = replyId;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public int getReceiver() {
        return receiver;
    }

    public void setReceiver(int receiver) {
        this.receiver = receiver;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public boolean isMessageSeen() {
        return isMessageSeen;
    }

    public void setMessageSeen(boolean messageSeen) {
        isMessageSeen = messageSeen;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public boolean isEdited() {
        return isEdited;
    }

    public void setEdited(boolean edited) {
        isEdited = edited;
    }

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}

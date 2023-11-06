package com.sixgod.domain.chatbot;

import com.sixgod.domain.chatbot.model.aggregates.UnAnsweredQuestionsAggregates;

import java.io.IOException;

public interface IChatbotApi {

    UnAnsweredQuestionsAggregates queryUnAnsweredQuestionsTopicId(String groupId, String cookie) throws IOException;

    boolean answer(String groupId, String cookie, String topicId, String text, boolean silenced) throws IOException;

}

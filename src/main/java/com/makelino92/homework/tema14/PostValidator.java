package com.makelino92.homework.tema14;

public class PostValidator {
    public String getPostStatus(String postBody) {
        if (postBody == null || postBody.isEmpty()) {
            return "ERROR_EMPTY";
        }
        if (postBody.length() > 250) {
            return "ERROR_TOO_LONG";
        }
        if (postBody.toLowerCase().contains("politica")) {
            return "ERROR_FORBIDDEN";
        }
        return "POST_VALID";
    }
}
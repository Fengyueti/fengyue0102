package com.example.lenovo.fengyue0102.net;

import com.example.lenovo.fengyue0102.entity.User;

public interface RequestCallback {
    void failure(String msg);
    void success(User user);
    void successmsg(String msg);
}

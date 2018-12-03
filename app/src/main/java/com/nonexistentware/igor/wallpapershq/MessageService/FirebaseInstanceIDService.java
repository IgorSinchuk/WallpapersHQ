package com.nonexistentware.igor.wallpapershq.MessageService;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class FirebaseInstanceIDService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {

        String refToken = FirebaseInstanceId.getInstance().getToken();

        sendRegToServer(refToken);

        super.onTokenRefresh();
    }

    private void sendRegToServer(String refToken) {

    }
}

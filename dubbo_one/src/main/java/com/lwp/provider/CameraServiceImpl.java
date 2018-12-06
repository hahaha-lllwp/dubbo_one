package com.lwp.provider;

import com.lwp.api.Camera;
import com.lwp.api.CameraService;

public class CameraServiceImpl implements CameraService {
    public String printMessage(Camera camera) {
        System.out.println(camera.toString());
        return camera.toString();
    }
}


package com.mytube;

public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("john@domain.com"));

        ICustomerNotificationService notificationService = new EmailService();
        IVideoEncoder encoder = new VideoEncoder();
        IVideoStorage storage = new VideoDatabase();

        var processor = new VideoProcessor(encoder, storage, notificationService);
        processor.process(video);
    }
}

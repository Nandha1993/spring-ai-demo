package com.vojtechruzicka.springaidemo;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.ai.image.ImageResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class AiController {

    private final ImageService imageService;

    public AiController(ImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping("generate-image")
    public void generateImage(HttpServletResponse response, @RequestParam("prompt") String prompt) throws IOException {
        ImageResponse imageResponse = imageService.generateImage(prompt);

        String imageUrl = imageResponse.getResult().getOutput().getUrl();

        response.sendRedirect(imageUrl);
    }

}

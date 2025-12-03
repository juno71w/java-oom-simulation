package com.heapdump.simulation;

import org.mycache.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/simulation/photo-cache")
public class PhotoCacheOomController {

    private static final Random RANDOM = new Random();
    private static final MyCache myCache = new MyCache();
    private static final int ONE_HUNDRED_MB = 10 * 1024 * 1024;

    @GetMapping("/oom")
    public String simulatePhotoCacheOom(@RequestParam(name = "id") long id) {

        byte[] photo = new byte[ONE_HUNDRED_MB];
        RANDOM.nextBytes(photo);
        myCache.wrongPut(id, photo);

        return "캐시에 저장 성공!!";
    }
}
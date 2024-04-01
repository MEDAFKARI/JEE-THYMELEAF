package com.AtelierJEE.JEEVIDEOCREATOR.web;

import com.AtelierJEE.JEEVIDEOCREATOR.DAO.entities.Video;
import com.AtelierJEE.JEEVIDEOCREATOR.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Date;


@Controller
@RequestMapping("/videos")
public class VideoController {
    @Autowired
    VideoService Vservice;

    @GetMapping("/Allvideos")
    public String allVids(Model model){
        Collection<Video> videos = Vservice.getAllVideos();
        model.addAttribute("videos",videos);
        return "videoList";
    }

    @GetMapping("/AddVideo")
    public String AddVideo(Model model){
        return "addvideo";
    }

    @PostMapping("AddVideo")
    public String AddVideoPost(Model model,
                               @RequestParam(name = "name") String name,
                               @RequestParam(name = "description") String desc,
                               @RequestParam(name = "imageurl") String imgurl,
                               @RequestParam(name = "url") String url){

        Video video = new Video();
        video.setName(name);
        video.setDescription(desc);
        video.setUrl(url);
        video.setImageUrl(imgurl);
        video.setDatePublication(new Date());
        Vservice.addVideo(video);
        return "redirect:/videos/Allvideos";
    }

    @GetMapping("/deleteVideo/{id}")
    public String Deletevideo(@PathVariable Long id){
         Vservice.deleteVideo(id);
        return "redirect:/videos/Allvideos";
    }



}

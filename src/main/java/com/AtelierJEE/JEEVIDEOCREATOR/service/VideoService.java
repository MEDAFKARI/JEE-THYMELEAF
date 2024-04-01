package com.AtelierJEE.JEEVIDEOCREATOR.service;

import com.AtelierJEE.JEEVIDEOCREATOR.DAO.entities.Creator;
import com.AtelierJEE.JEEVIDEOCREATOR.DAO.entities.Video;

import java.util.Collection;
import java.util.Optional;

public interface VideoService {
    public Video addVideo(Video video);
    public Video deleteVideo(Long Id);
    public Video modifyVideo(Video video);
    public Collection<Video> getAllVideos();
    public Optional<Video> getVideosByCreator(Creator creator);
}

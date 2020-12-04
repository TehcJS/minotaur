package com.modrinth.minotaur.responses;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseUpload {
    
    @Expose
    @SerializedName("status")
    private String status;
    
    @Expose
    @SerializedName("lastStatusChanged")
    private Long lastStatusChanged;
    
    @Expose
    @SerializedName("id")
    private Long id;
    
    @Expose
    @SerializedName("name")
    private String name;
    
    @Expose
    @SerializedName("downloadURL")
    private String downloadURL;
    
    @Expose
    @SerializedName("size")
    private Long size;
    
    @Expose
    @SerializedName("changelog")
    private String changelog;
    
    @Expose
    @SerializedName("sha512")
    private String sha512;
    
    @Expose
    @SerializedName("releaseType")
    private String releaseType;
    
    @Expose
    @SerializedName("classifier")
    private String classifier;
    
    @Expose
    @SerializedName("createdAt")
    private Long createdAt;
    
    @Expose
    @SerializedName("gameVersions")
    private final List<GameVersion> gameVersions = null;
    
    @Expose
    @SerializedName("gameSlug")
    private String gameSlug;
    
    @Expose
    @SerializedName("projectTypeSlug")
    private String projectTypeSlug;
    
    @Expose
    @SerializedName("projectSlug")
    private String projectSlug;
    
    @Expose
    @SerializedName("uploaderUserId")
    private Long uploaderUserId;
    
    @Expose
    @SerializedName("uploaderUsername")
    private String uploaderUsername;
    
    @Expose
    @SerializedName("uploaderDisplayName")
    private String uploaderDisplayName;
    
    public String getStatus () {
        
        return this.status;
    }
    
    public Long getLastStatusChanged () {
        
        return this.lastStatusChanged;
    }
    
    public Long getId () {
        
        return this.id;
    }
    
    public String getName () {
        
        return this.name;
    }
    
    public String getDownloadURL () {
        
        return this.downloadURL;
    }
    
    public Long getSize () {
        
        return this.size;
    }
    
    public String getChangelog () {
        
        return this.changelog;
    }
    
    public String getSha512 () {
        
        return this.sha512;
    }
    
    public String getReleaseType () {
        
        return this.releaseType;
    }
    
    public String getClassifier () {
        
        return this.classifier;
    }
    
    public Long getCreatedAt () {
        
        return this.createdAt;
    }
    
    public List<GameVersion> getGameVersions () {
        
        return this.gameVersions;
    }
    
    public String getGameSlug () {
        
        return this.gameSlug;
    }
    
    public String getProjectTypeSlug () {
        
        return this.projectTypeSlug;
    }
    
    public String getProjectSlug () {
        
        return this.projectSlug;
    }
    
    public Long getUploaderUserId () {
        
        return this.uploaderUserId;
    }
    
    public String getUploaderUsername () {
        
        return this.uploaderUsername;
    }
    
    public String getUploaderDisplayName () {
        
        return this.uploaderDisplayName;
    }
    
    public static class GameVersion {
        
        @Expose
        @SerializedName("version")
        private String version;
        
        @Expose
        @SerializedName("type")
        private String type;
        
        @Expose
        @SerializedName("released")
        private long released;
        
        public String getVersion () {
            
            return this.version;
        }
        
        public String getType () {
            
            return this.type;
        }
        
        public Long getReleaseDate () {
            
            return this.released;
        }
    }
}
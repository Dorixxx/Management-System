package com.example.eProject.db;

public class user {

    private String name;
    private int permission;
    private int resourceId;
    private int position;
    private int status;

    public user(String name,int permission,int resourceId,int position){
        this.name=name;
        this.permission=permission;
        this.resourceId=resourceId;
        this.position=position;
        this.status=1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPermission() {
        return permission;
    }

    public int getPosition() {
        return position;
    }

    public int getResourceId() {
        return resourceId;
    }

    public int getStatus() {
        return status;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public void setStatus(int status) {
        if(status==0||status==1)
        this.status = status;
    }

    public boolean isCancel(){
        return status==0;
    }
}

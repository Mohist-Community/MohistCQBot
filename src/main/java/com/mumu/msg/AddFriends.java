package com.mumu.msg;


import cc.plural.jsonij.JSON;
import cc.plural.jsonij.parser.ParserException;

import java.io.IOException;

public class AddFriends extends RE_MSG
{
    private String act;
    private String subType;
    private String sendTime;
    private String fromQQ;
    private String msg1;
    private String responseFlag;
    
    public AddFriends(String msg) {
        super(msg);
        try {

            JSON json = JSON.parse(msg);
            this.act = String.format("%s", json.get("act"));
            this.subType = String.format("%s", json.get("subType"));
            this.sendTime = String.format("%s", json.get("sendTime"));
            this.fromQQ = String.format("%s", json.get("fromQQ"));
            this.msg1 = String.format("%s", json.get("msg"));
            this.responseFlag = String.format("%s", json.get("responseFlag"));
            this.type = 301;
        }
        catch (ParserException | IOException e) {
            e.printStackTrace();
        }
    }
    
    public String getAct() {
        return this.act;
    }
    
    public String getSubType() {
        return this.subType;
    }
    
    public String getSendTime() {
        return this.sendTime;
    }
    
    public String getFromQQ() {
        return this.fromQQ;
    }
    
    public String getMsg() {
        return this.msg1;
    }
    
    public String getResponseFlag() {
        return this.responseFlag;
    }
}

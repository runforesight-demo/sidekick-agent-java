package com.runsidekick.agent.tracepoint.request;

import com.runsidekick.agent.broker.request.impl.BaseRequest;

/**
 * @author serkan
 */
public class PutTracePointRequest extends BaseRequest {

    private String tracePointId;
    private String fileName;
    private String className;
    private int lineNo;
    private String fileHash;
    private String conditionExpression;
    private int expireSecs;
    private int expireCount;
    private boolean enableTracing;

    public String getTracePointId() {
        return tracePointId;
    }

    public void setTracePointId(String tracePointId) {
        this.tracePointId = tracePointId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getLineNo() {
        return lineNo;
    }

    public void setLineNo(int lineNo) {
        this.lineNo = lineNo;
    }

    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }

    public String getConditionExpression() {
        return conditionExpression;
    }

    public void setConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    public int getExpireSecs() {
        return expireSecs;
    }

    public void setExpireSecs(int expireSecs) {
        this.expireSecs = expireSecs;
    }

    public int getExpireCount() {
        return expireCount;
    }

    public void setExpireCount(int expireCount) {
        this.expireCount = expireCount;
    }

    public boolean isEnableTracing() {
        return enableTracing;
    }

    public void setEnableTracing(boolean enableTracing) {
        this.enableTracing = enableTracing;
    }

    @Override
    public String toString() {
        return "PutTracePointRequest{" +
                "tracePointId='" + tracePointId + '\'' +
                ", fileName='" + fileName + '\'' +
                ", className='" + className + '\'' +
                ", lineNo=" + lineNo +
                ", fileHash='" + fileHash + '\'' +
                ", conditionExpression='" + conditionExpression + '\'' +
                ", expireSecs=" + expireSecs +
                ", expireCount=" + expireCount +
                ", enableTracing=" + enableTracing +
                ", id='" + id + '\'' +
                ", client='" + client + '\'' +
                '}';
    }

}
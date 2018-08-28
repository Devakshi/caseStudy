public class node 
{
    Date timestamp;
    String data, nodeId, referenceNodeId, childReferenceNodeId, genesisReferenceNodeId, HashValue;
    int nodeNumber;
    
    node(Date timestamp,String data,String nodeId,String referenceNodeId,String childReferenceNodeId,String genesisReferenceNodeId,String HashValue,int nodeNumber)
    {
        this.timestamp=timestamp;
        this.data=data;
        this.nodeId=nodeId;
        this.referenceNodeId=referenceNodeId;
        this.childReferenceNodeId=childReferenceNodeId;
        this.genesisReferenceNodeId=genesisReferenceNodeId;
        this.HashValue=HashValue;
        this.nodeNumber=nodeNumber;
    }
    
    public Date setTimeStamp()
    {
        return timestamp;
    }
    
     public void getData(String data)
    {
        this.data=data;
        
    }
     
     public String setData(String data)
    {
        return data;
        
    }
     
     public void getnodeId(String nodeId)
    {
        this.nodeId=nodeId;
        
    }
     
     public String setnodeId(String nodeId)
    {
        return nodeId;
    }    
     
     public void getreferenceNodeId(String referenceNodeId)
    {
        this.referenceNodeId=referenceNodeId;
        
    }
     
     public String setreferenceNodeId(String referenceNodeId)
    {
        return referenceNodeId;
    }
     
    public void getchildReferenceNodeId(String childReferenceNodeId)
    {
        this.childReferenceNodeId=childReferenceNodeId;
        
    }
     
     public String setchildReferenceNodeId(String childReferenceNodeId)
    {
        return childReferenceNodeId;
    }
     
    public void getgenesisReferenceNodeId(String genesisReferenceNodeId)
    {
        this.genesisReferenceNodeId=genesisReferenceNodeId;
        
    }
     
     public String setgenesisReferenceNodeId(String genesisReferenceNodeId)
    {
        return genesisReferenceNodeId;
    }
     
     public void getHashValue(String HashValue)
    {
        this.HashValue=HashValue;
        
    }
     
     public String setHashValue(String HashValue)
    {
        return HashValue;
    }
     
     public void getnodeNumber()
    {
        this.nodeNumber=nodeNumber;
        
    }
     
     public int setnodeNumber()
    {
        return nodeNumber;
        
    }
     
     
     
}

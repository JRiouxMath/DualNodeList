public class DualNode
{
    private int data;
    private DualNode linkAdded;
    private DualNode linkAscending;

    /**
     * Constructor methods
     */
    public DualNode()
    {
        data = 0;
        linkAdded = null;
        linkAscending = null;

    }//end default constructor

    public DualNode(int data, DualNode linkAdded, DualNode linkAscending)
    {
        this.data = data;
        this.linkAscending = linkAscending;
        this.linkAdded = linkAdded;
    }//end three arg constructor


    /**
     * Setters
     */
    public void setData(int data)
    {
        this.data = data;
    }// end method to set data value

    public void setLinkAdded(DualNode linkAdded)
    {
        this.linkAdded = linkAdded;
    }//end method to set LinkAdded value

    public void setLinkAscending(DualNode linkAscending)
    {
        this.linkAscending = linkAscending;
    }

    /**
     * Getters
     */
    public int getData()
    {
        return data;
    }// end method to get Data

    public DualNode getLinkAdded()
    {
        return linkAdded;
    }//end method to get LinkAdded value

    public DualNode getLinkAscending()
    {
        return linkAscending;
    }//end method to get LinkAscending value

    /**
     * ToString
     */

    @Override
    public String toString()
    {
        return Integer.toString(data);
    }
}// end class DualNode

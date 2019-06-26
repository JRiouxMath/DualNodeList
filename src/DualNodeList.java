public class DualNodeList
{
    private DualNode headAdd;
    private DualNode headAsc;

    /**
     * Constructor
     */
    public DualNodeList()
    {
        headAdd = null;
        headAsc = headAdd;
    }//end default constructor


    /**
     * Setters
     */
    public void addNodeToStart(int data)
    {
//        if (headAdd == null)
        headAdd = new DualNode(data, headAdd, headAsc);
    }//end method to add a node to the start of the list

    /**
     * Getters
     */

    /**
     * Brain Methods
     */
//    public void SortAscending(int data)
//    {
//        DualNode temp = head;
//        if (head != null)
//        {
//            while(temp.getData()>head.getData())
//        }//end if head !null
//
//    }//end method to sort values in ascending order

//    public DualNode find (int target)
//    {
//        boolean found = false;
//        DualNode temp = head;
//        while((temp != null) && !found)
//        {
//            DualNode linkAscAtTemp = temp.getLinkAscending();
//            if(linkAscAtTemp.equals(target))
//                found = true;
//            else
//                temp = temp.
//        }//end while loop
//    }//end method to find a node by ascending value

    /**
     * ToString
     */
    @Override
    public String toString()
    {
        String output = "";

        DualNode temp = headAdd;
        while (temp != null)
        {
            output += temp.getData() + " ";
            temp = temp.getLinkAdded();
        }//end while loop
        return output;
    }//end toString method
}//end class to implement the DualNode on a list

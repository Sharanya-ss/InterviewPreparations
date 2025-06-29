package DSA;

import java.util.Objects;

public class HashMap<k,v> {
    
	private static final int LOOAD_CAPACITY=16;
	private static final float LOADFACTOR=0.75f;
	private Node<k,v>[] buckets;
	private int size;
	
	@SuppressWarnings("unchecked")
	public HashMap() {
		
		buckets=new Node[LOOAD_CAPACITY];
		size=0;
	}
	
	private int hash(k key) {
		return key==null?0: Math.abs(key.hashCode() % buckets.length);
	}
	public void put(k key,v value) {
		int index=hash(key);
		Node<k,v> newNode=new Node<>(key,value);
		//collision Handling
		/*
		 * Separate Chaining: Each bucket is a linked list. If multiple keys hash to the
		 * same index, they are stored in a linked list. New elements are appended at
		 * the end of the list. When searching, we traverse the linked list to find the
		 * matching key.
		 */
		if(buckets[index]==null) {
			buckets[index]=newNode;
		}else {
			   Node<k,v> current=buckets[index];//current Node or Linked list // we to traverse and add the value at the last
			   Node<k,v> prev=null;
			// Traverse the linked list (handling collision via separate chaining)
			   while(current!=null){
				   if(Objects.equals(current.key, key)) {
					   current.value=value;
					   return;
				   }
				   prev=current;
				   current=current.next;
				   
				   
			   }
			   prev.next=newNode;
			}
		size++;
		if((float)size/buckets.length>LOADFACTOR) {
			//resize();
		}
			
		}
	

    static class Node<k,v>{
    	 k key;
    	 v value;
    	 Node<k,v> next;
    	Node(k key,v value){
    		this.key=key;
    		this.value=value;
    		next=null;
    	}
    	
    }
}

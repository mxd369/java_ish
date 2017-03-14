package linkedstackcode;
public class LinkedListStack<T> implements StackADT<T>
{
	private int count;
	private LinearNode<T> top;
	
	public LinkedListStack()
	{
		count =0;
		top = null;
	}
	
	public void push(T element)
	{
		LinearNode<T> temp = new LinearNode<T>(element);
		temp.setNext(top);
		top = temp;
		count++;
	}
	
	public T pop()
	{
		T result = top.getElement();
		top = top.getNext();
		count --;
		return result;
	}
	
	public T peek()
	{
		T result = top.getElement();
		return result;
	}
	
	public int size()
	{
		int size = count;
		return size;
	}
	
	public boolean isEmpty()
	{
		boolean result;
		if (count ==0)
			result = true;
		else
			result = false;
		return result;
	}
	
	public String toString()
	{
		String str = "";
		if(!isEmpty())
		{
			LinearNode<T> current = top;
			while(current!=null)
			{
				str+= current + " ";
			}
		}
		return str;
	}
}

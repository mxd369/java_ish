package linkedstackcode;
public class LinearNode<T> 
{
	private T element;
	private LinearNode<T> next;
	
	
	public LinearNode()
	{
		next = null;
		element = null;
	}
	
	public LinearNode(T element)
	{
		this.element = element;
		next = null;
	}
	
	public LinearNode<T> getNext()
	{
		return next;
	}
	
	public void setNext(LinearNode<T> node)
	{
		next = node;
	}
	
	public T getElement()
	{
		return element;
	}
	
	public void setElement(T element)
	{
		this.element = element;
	}
}

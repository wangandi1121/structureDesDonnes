package structure_practice;

public class DoubleLink<T> {
	private DNode<T> head;//表头
	private int count;//结点个数
	
	private class DNode<T>{//结点构造体
		public T val;
		public DNode prev;
		public DNode next;
		DNode(T val,DNode prev,DNode next){
			this.next = next;
			this.prev = prev;
			this.val = val;
		}
	}
	public DoubleLink(){
		head = new DNode<T>(null,null,null);//表头没有数据
		head.prev = head.next = head;
	}
	private DNode<T> getNode(int index) {//获取第index位置的节点
		if(index<0||index>count)
			throw new IndexOutOfBoundsException();
		DNode<T> node = head.next;
		if(index<=count) {
			for(int i=0;i<index;i++)
				node = node.next;
			return node;		
		}
		return node;
	}
	public T get(int index) {//获取第index位置结点的值
		return getNode(index).val;
	}
	public void insert(int index,T t) {//将结点插入第index个位置
		if(index==0) {
			
		}
	}
}

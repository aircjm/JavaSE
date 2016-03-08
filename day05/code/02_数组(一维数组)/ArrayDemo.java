/*
	数组:存储同一种数据类型的多个元素的容器。
	
	定义格式：
		A:数据类型[] 数组名;
		B:数据类型 数组名[];
		
	举例：
		A:int[] a; 定义一个int类型的数组a变量
		B:int a[]; 定义一个int类型的a数组变量
		
	注意：效果可以认为是一样的，都是定义一个int数组，但是念法上有些小区别。推荐使用第一种。
	
	如何对数组进行初始化呢?
		A:何谓初始化呢? 就是为数组开辟内存空间，并为每个数组元素赋予值
		B:有几种方式呢?
			a:动态初始化 只指定长度，由系统给出初始化值
			b:静态初始化 给出初始化值，由系统决定长度
			
	动态初始化的格式：
		数据类型[] 数组名 = new 数据类型[数组长度];
		
		举例：
		int[] arr = new int[3];	
		
	如何获取数组中的元素呢?
		通过:
			数组名[索引]
			索引其实就是每个元素的编号，从0开始，最大索引是数组的长度-1。
*/
class ArrayDemo {
	public static void main(String[] args) {
		//定义一个数组
		//int[] a;
		//可能尚未初始化变量a
		//System.out.println(a);
		
		int[] arr = new int[3];
		/*
			左边：
				int:说明数组中的元素的数据类型是int类型
				[]:说明这是一个数组
				arr:是数组的名称
				
			右边：
				new:为数组分配内存空间。
				int:说明数组中的元素的数据类型是int类型
				[]:说明这是一个数组
				3:数组长度，其实也就是数组中元素的个数
		*/
		
		System.out.println(arr); //[I@175078b 地址值。
		//我要地址值没有意义啊，我就要数据值，怎么办呢?
		//不用担心，java为你考虑到了。
		//其实数组中的每个元素都是有编号的，并且是从0开始。最大编号是数组的长度-1。
		//用数组名和编号的配合就可以获取数组中的指定编号的元素。这个编号的专业叫法：索引
		//通过数组名访问数据的格式是：数组名[索引];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}
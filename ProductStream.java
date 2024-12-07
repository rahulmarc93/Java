package streamAPIDemo;

import java.util.*;
import java.util.stream.Collectors;

class Product
{
	int id;
	String name;
	double price;
	Product(int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}

public class ProductStream {

	public static void main(String[] args) {
		List<Product> prdct=new ArrayList<>();
		//Add Product
		prdct.add(new Product(1,"Asus",48000));
		prdct.add(new Product(2,"HP",60000));
		prdct.add(new Product(3,"Del",55000));
		prdct.add(new Product(1,"Acer",40000));
		prdct.add(new Product(1,"Lenovo",45000));
		
		List<Double>PrdctPriceList=prdct.stream().filter(p->p.price<50000)//Filtering data
				.map(p->p.price)//fetching price
				.collect(Collectors.toList());//Collecting into List
		System.out.println(PrdctPriceList);
		prdct.stream().filter(p->p.price<50000).forEach(product->System.out.println(product.name));
	}

}

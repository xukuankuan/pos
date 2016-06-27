/**
 * Created by qhfz on 2016/6/27.
 */
    package java.company;

    import java.util.Scanner;
    import java.util.Vector;

    public class Discount {

        public static void main(String[] args) {
            // write your code here
            String name;
            String unit;
            String barcode;
            Vector <Item> goods = new Vector<Item>();
            float price;
            double discount;
            int c0=0,c1=0,c2=0;
            int choose;
            while(true)
            {
                System.out.print("barcode:");
                Scanner in=new Scanner(System.in);
                barcode=in.nextLine();
                System.out.print("name:");
                name=in.nextLine();
                System.out.print("unit:");
                unit=in.nextLine();
                System.out.print("price:");
                price=in.nextFloat();
                System.out.print("discount:");
                discount = in.nextDouble();

                if(barcode=="ITEM000000")
                {
                    c0++;
                }
                if(barcode=="ITEM000000")
                {
                    c1++;
                }
                if(barcode=="ITEM000000")
                {
                    c2++;
                }
                System.out.println("If continue?1.yes\t2.no");
                choose=in.nextInt();
                if(choose==2)
                {
                    break;
                }
                Item a = new Item(barcode,name,unit,price,discount);
                goods.add(a);
            }
            System.out.println("***商店购物清单***");
            System.out.printf("名称:可口可乐,数量:%d,单价:3.00(元),小计:%d,折扣：%d",c0,c0*3,goods.get(0).getDiscount());
            System.out.printf("名称:雪碧,数量:%d,单价:3.00(元),小计:%d,折扣：%d",c1,c1*3,goods.get(1).getDiscount());
            System.out.printf("名称:电池,数量:%d,单价:2.00(元),小计:%d折扣：%d",c2,c2*2,goods.get(2).getDiscount());
            System.out.println("----------------");
            System.out.printf("总计:%d",c0*3+c1*3+c2*2);
        }
    }

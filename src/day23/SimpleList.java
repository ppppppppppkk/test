package day23;

import java.sql.Array;

public class SimpleList <E> {
private Object[] array;
private int size;
public SimpleList(){
 array = new Object[0];}
//3. 메소드




// 삽입 메소드
    public boolean add( E element) {
       try {
           this.size++;

           Object[] newArray = new Object[size];
           for (int i = 0; i < this.array.length; i++) {
               newArray[i] = array[i];
           }

           array = newArray;
           array[this.size - 1] = element;
           return true;
        }catch (Exception e){
           e.printStackTrace();
           return false;
       }
    }

    public E get(int index){
    return (E)this.array[index];
    }

    // 삭제 메소드
    public boolean remove( int index){

    this.size--;
    Object[] newArray = new Object[size];

    int j = 0;
    for(int i = 0; i< this.array.length; i++){
        newArray[j] = array[i];
            //삭제 : 삭제하 ㄹ인덱스를 빼고 카피
        //만약에 삭제할 인덱스가 아니면
        if( i != index ) j++;
    }
    array = newArray;
    return true;
    }

    // 호출 메소드
    public int size() { return this.size; }

    // toString 메소드
    @Override
    public  String  toString(){
    String str = "[";
    for( int i = 0; i <this.array.length; i++){
        str += array[i].toString();
        str += i != this.array.length-1 ? ", ": "";
    }
    return str+"]";
    }


}

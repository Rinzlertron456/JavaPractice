import java.util.*;

public class FindTheUnion {
    public static void main(String[] args) {
        int[] a={1,2,3,4,6,1}, b={2,3,5};
        ArrayList<Integer> list= new ArrayList<>();
        int i=0,j=0;
        //Cover elements of both arrays
        while(i<a.length&&j<b.length){
            //Add a[i] elements which aren't in the list
            if(a[i]<b[j]){
                if(list.isEmpty()||a[i]!=list.get(list.size()-1)) list.add(a[i]);
                i++;
            }
            //Add b[j] elements which aren't in the list
            else if(a[i]>b[j]){
                if(list.isEmpty()||b[j]!=list.get(list.size()-1)) list.add(b[j]);
                j++;
            }
            else{
                if(list.isEmpty()||a[i]!=list.get(list.size()-1)) list.add(a[i]);
                i++;
                j++;
            }
            //Add remaining elements in a[] array
        }
        while (i < a.length) {

            if (a[i]!=list.get(list.size()-1)) {

                list.add(a[i]);

            }

            i++;
// Add remaining elements of array b
        }
        while (j < b.length) {

            if (b[j]!=list.get(list.size()-1)) {

                list.add(b[j]);

            }

            j++;

        }
        System.out.println(list);
//        for (int index = 0; index < a.length; index++) {
//            if(!list.contains(a[index])) list.add(a[index]);
//        }
//        for (int index = 0; index < b.length; index++) {
//            if(!list.contains(b[index])) list.add(b[index]);
//        }
//        Collections.sort(list);
//        System.out.println(list);
    }
}

package niuhaihang.test;

import java.util.Arrays;
import java.util.List;

/** 
 *  
 * ������ʾ��Arrays���е�asList���� 
 * ͨ���ĸ���������ʾ,���ֳ��˸÷������������. 
 *  
 * (1) �÷������ڻ����������͵�����֧�ֲ�����,�������ǻ�����������ʱ������ʹ�� 
 * (2) ��ʹ��asList()����ʱ������ͺ��б�������һ����. 
 *     ����������֮һʱ����һ�����Զ���ø��¡� 
 *     ע��:������Զ�����������,���������������鲻�߱������� 
 * (3) asList�õ��������ǵ�û��add��remove������ 
 *  
 * �Ķ����:ͨ���鿴Arrays���Դ�����֪��,asList���ص�List��Array�е�ʵ�ֵ� 
 * �ڲ���,�����ಢû�ж���add��remove����.����,Ϊʲô�޸�����һ��,��һ��Ҳ�Զ� 
 * ��ø�����,��ΪasList���Listʵ�����õľ������� 
 */ 
public class AslistTest {
    public static void main(String[] args) {
        
        /*����һ:������������ʹ��asList������   */
        
        /* ˵��:��Ȼ��jdk1.6���ܹ��������������͵�����ת����List,�������и�ȱ��   */
        System.out.println("����һ��ʼ�ָ���--------------");
        int [] a_int = { 1, 2, 3, 4 };
        /*Ԥ�����Ӧ������1��2��3��4����ʵ��������Ľ�����һ������,��������a_int ����һ��Ԫ��*/
        List a_int_List = Arrays.asList(a_int);
        foreach(a_int_List);
        /*Ϊ��������Ҫ������������Ԫ��*/
        foreachForBase(a_int_List);
        
        /*��������������͵�����ʹ��asList��������Ԥ�ڵ� */
        System.out.println("�������ʼ�ָ���--------------");
        Integer[] a_Integer= new Integer[] { 1, 2, 3, 4 };
        List a_Integer_List = Arrays.asList(a_Integer);
        foreach(a_Integer_List);
        
        
        /*������:�������������asList֮���List,��һ�����Զ���ø���*/
        System.out.println("��������ʼ�ָ���--------------");
        a_Integer_List.set(0, 0);
        foreach(a_Integer_List);
        foreach(a_Integer);
        
        a_Integer[0] =5;
        foreach(a_Integer_List);
        foreach(a_Integer);
        
        
        /*������:�Ի����������飬ͨ��asList֮���List�޸Ķ�Ӧ��ֵ��,������ʱ�ᱨ���쳣
         * ���ǻ������������Ӧ��List�ǻᷢ���仯�ģ����Ǻ������ʵ� 
         * 
         * 
         * a_int_List.set(0,0);
         * foreach(a_int_List);foreach(a_int);
         * */
        
        System.out.println("�����Ŀ�ʼ�ָ���------------------");
        a_int[0]=4;
        foreachForBase(a_int_List);
        foreach(a_int);

    }

    /*��ӡ����*/
    private static void foreach(List list) {
        for (Object object : list) {
            System.out.println(object + " ");
        }
        System.out.println();
        
    }
    
    
    private static void foreachForBase(List a_int_List) {
        int[] _a_int = (int[]) a_int_List.get(0);    
        foreach(_a_int);
    }

    private static void foreach(int[] a_int) {
        for (int i : a_int) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
    
    
    private static void foreach(Integer[] _a_Integer) {
        for (int i : _a_Integer) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
}
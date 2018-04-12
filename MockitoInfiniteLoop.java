public class MockitoInfiniteLoop {

   public static void main(String[] args) throws InterruptedException {

     
org.mockito.internal.util.concurrent.WeakConcurrentMap<java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>,java.lang.Object> 
cleanerEnumWeakConcurrentMap1 = new 
org.mockito.internal.util.concurrent.WeakConcurrentMap<java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>,java.lang.Object>(false);
     java.lang.ref.Reference<? extends 
java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>> 
wildcardReference2 = cleanerEnumWeakConcurrentMap1.remove();

   }

}




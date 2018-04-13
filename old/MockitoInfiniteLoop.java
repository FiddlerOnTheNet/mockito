public class MockitoInfiniteLoop {

   public static void main(String[] args) throws InterruptedException {

// The following three lines construct an empty WeakConcurrentMap called cleanerEnumWeakConcurrentMap - this appears to be working fine
// The enum just specifies how stale entries are cleaned. "MANUALLY", "INLINE" or "THREAD"
org.mockito.internal.util.concurrent.WeakConcurrentMap<java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>,java.lang.Object> 
cleanerEnumWeakConcurrentMap1 = new 
org.mockito.internal.util.concurrent.WeakConcurrentMap<java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>,java.lang.Object>(false);

// The "(false)" at the end there indicates that a cleaner thread should NOT be started to "remove stale entries"

// The remove function, used here, is hanging. This is the Cleaner Enum "remove" function,
// which, "Removes the next reference object in this queue, blocking until one becomes available."
// ... so... perhaps calling "remove" on an empty queue results in hanging?
java.lang.ref.Reference<? extends java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>> 
wildcardReference2 = cleanerEnumWeakConcurrentMap1.remove(); //Hanging here
System.out.println("Made it");

   }

}




import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0Minimized {

    public static boolean debug = false;
/*
    @Test
    public void test01() throws Throwable {
        java.util.LinkedHashSet<java.lang.Object> objSet28 = new java.util.LinkedHashSet<java.lang.Object>();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet31 = org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.of((java.lang.Iterable<java.lang.Object>) objSet28);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objSet28 and hashCodeAndEqualsSafeSet31.", objSet28.equals(hashCodeAndEqualsSafeSet31) == hashCodeAndEqualsSafeSet31.equals(objSet28));
    }

    @Test
    public void test02() throws Throwable {
        java.util.LinkedHashSet<java.lang.Object> objSet25 = new java.util.LinkedHashSet<java.lang.Object>();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet28 = org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.of((java.lang.Iterable<java.lang.Object>) objSet25);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objSet25 and hashCodeAndEqualsSafeSet28.", objSet25.equals(hashCodeAndEqualsSafeSet28) == hashCodeAndEqualsSafeSet28.equals(objSet25));
    }

    @Test
    public void test03() throws Throwable {
        java.util.LinkedHashSet<java.lang.Object> objSet25 = new java.util.LinkedHashSet<java.lang.Object>();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet28 = org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.of((java.lang.Iterable<java.lang.Object>) objSet25);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objSet25 and hashCodeAndEqualsSafeSet28.", objSet25.equals(hashCodeAndEqualsSafeSet28) == hashCodeAndEqualsSafeSet28.equals(objSet25));
    }
*/
    @Test
    public void test04() throws Throwable {
        org.mockito.internal.util.concurrent.WeakConcurrentSet.Cleaner cleaner0 = org.mockito.internal.util.concurrent.WeakConcurrentSet.Cleaner.INLINE;
        org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String> strWeakConcurrentSet1 = new org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String>(cleaner0);
        strWeakConcurrentSet1.remove("");
    }
/*
    @Test
    public void test05() throws Throwable {
        org.mockito.internal.util.concurrent.WeakConcurrentSet.Cleaner cleaner0 = org.mockito.internal.util.concurrent.WeakConcurrentSet.Cleaner.INLINE;
        org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String> strWeakConcurrentSet1 = new org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String>(cleaner0);
        org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String> strWeakConcurrentSet3 = org.mockito.internal.util.Checks.checkNotNull(strWeakConcurrentSet1, "");
        strWeakConcurrentSet3.remove("");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet0 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.lang.Iterable<java.lang.Object> objIterable2 = org.mockito.internal.util.Checks.checkItemsNotNull((java.lang.Iterable<java.lang.Object>) hashCodeAndEqualsSafeSet0, "");
        org.mockito.internal.util.concurrent.WeakConcurrentMap<java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>, java.lang.Object> cleanerEnumWeakConcurrentMap4 = new org.mockito.internal.util.concurrent.WeakConcurrentMap<java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>, java.lang.Object>(false);
        org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner cleaner5 = org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner.INLINE;
        java.lang.Object obj6 = cleanerEnumWeakConcurrentMap4.get((java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>) cleaner5);
        cleanerEnumWeakConcurrentMap4.expungeStaleEntries();
        boolean boolean8 = hashCodeAndEqualsSafeSet0.add((java.lang.Object) cleanerEnumWeakConcurrentMap4);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet9 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        org.mockito.internal.util.concurrent.WeakConcurrentMap<java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>, java.lang.Object> cleanerEnumWeakConcurrentMap11 = new org.mockito.internal.util.concurrent.WeakConcurrentMap<java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>, java.lang.Object>(false);
        boolean boolean12 = hashCodeAndEqualsSafeSet9.add((java.lang.Object) cleanerEnumWeakConcurrentMap11);
        boolean boolean13 = hashCodeAndEqualsSafeSet0.add((java.lang.Object) cleanerEnumWeakConcurrentMap11);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet14 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet16 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet14, "hi!");
        int int17 = hashCodeAndEqualsSafeSet16.size();
        java.util.Spliterator<java.lang.Object> objSpliterator18 = hashCodeAndEqualsSafeSet16.spliterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet19 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor20 = hashCodeAndEqualsSafeSet19.iterator();
        java.util.Iterator<java.lang.Object> objItor21 = hashCodeAndEqualsSafeSet19.iterator();
        hashCodeAndEqualsSafeSet19.clear();
        org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner cleaner46 = org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner.INLINE;
        java.lang.Object[] objArray47 = new java.lang.Object[] { (short) 10, (byte) 100, 1.0d, 1, (-1.0f), 10.0f, (byte) 1, 1, 10.0f, (-1.0d), (short) -1, "hi!", 1.0d, (byte) 1, 1.0f, (short) -1, 10, 10L, false, (byte) -1, (-1L), false, (-1), cleaner46 };
        java.util.LinkedHashSet<java.lang.Object> objSet48 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet48, objArray47);
        java.util.Spliterator<java.lang.Object> objSpliterator50 = objSet48.spliterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet51 = org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.of((java.lang.Iterable<java.lang.Object>) objSet48);
        boolean boolean52 = hashCodeAndEqualsSafeSet19.containsAll((java.util.Collection<java.lang.Object>) hashCodeAndEqualsSafeSet51);
        java.lang.Iterable[] iterableArray54 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked") java.lang.Iterable<java.lang.Object>[] objIterableArray55 = (java.lang.Iterable<java.lang.Object>[]) iterableArray54;
        objIterableArray55[0] = hashCodeAndEqualsSafeSet16;
        objIterableArray55[1] = hashCodeAndEqualsSafeSet51;
        java.lang.Iterable<java.lang.Object>[] objIterableArray60 = hashCodeAndEqualsSafeSet0.toArray(objIterableArray55);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner cleaner23 = org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner.INLINE;
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 10, (byte) 100, 1.0d, 1, (-1.0f), 10.0f, (byte) 1, 1, 10.0f, (-1.0d), (short) -1, "hi!", 1.0d, (byte) 1, 1.0f, (short) -1, 10, 10L, false, (byte) -1, (-1L), false, (-1), cleaner23 };
        java.util.LinkedHashSet<java.lang.Object> objSet25 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet25, objArray24);
        java.util.Spliterator<java.lang.Object> objSpliterator27 = objSet25.spliterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet28 = org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.of((java.lang.Iterable<java.lang.Object>) objSet25);
        boolean boolean30 = hashCodeAndEqualsSafeSet28.contains((java.lang.Object) (short) 10);
        boolean boolean31 = hashCodeAndEqualsSafeSet28.isEmpty();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet32 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet34 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet32, "hi!");
        org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner cleaner58 = org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner.INLINE;
        java.lang.Object[] objArray59 = new java.lang.Object[] { (short) 10, (byte) 100, 1.0d, 1, (-1.0f), 10.0f, (byte) 1, 1, 10.0f, (-1.0d), (short) -1, "hi!", 1.0d, (byte) 1, 1.0f, (short) -1, 10, 10L, false, (byte) -1, (-1L), false, (-1), cleaner58 };
        java.util.LinkedHashSet<java.lang.Object> objSet60 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet60, objArray59);
        java.util.Spliterator<java.lang.Object> objSpliterator62 = objSet60.spliterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet63 = org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.of((java.lang.Iterable<java.lang.Object>) objSet60);
        boolean boolean64 = hashCodeAndEqualsSafeSet63.isEmpty();
        int int65 = hashCodeAndEqualsSafeSet63.size();
        boolean boolean66 = hashCodeAndEqualsSafeSet32.containsAll((java.util.Collection<java.lang.Object>) hashCodeAndEqualsSafeSet63);
        boolean boolean67 = hashCodeAndEqualsSafeSet28.equals((java.lang.Object) boolean66);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objSet25 and hashCodeAndEqualsSafeSet63.", objSet25.equals(hashCodeAndEqualsSafeSet63) == hashCodeAndEqualsSafeSet63.equals(objSet25));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet0 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.lang.Iterable<java.lang.Object> objIterable2 = org.mockito.internal.util.Checks.checkItemsNotNull((java.lang.Iterable<java.lang.Object>) hashCodeAndEqualsSafeSet0, "");
        org.mockito.internal.util.concurrent.WeakConcurrentMap<java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>, java.lang.Object> cleanerEnumWeakConcurrentMap4 = new org.mockito.internal.util.concurrent.WeakConcurrentMap<java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>, java.lang.Object>(false);
        org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner cleaner5 = org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner.INLINE;
        java.lang.Object obj6 = cleanerEnumWeakConcurrentMap4.get((java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>) cleaner5);
        cleanerEnumWeakConcurrentMap4.expungeStaleEntries();
        boolean boolean8 = hashCodeAndEqualsSafeSet0.add((java.lang.Object) cleanerEnumWeakConcurrentMap4);
        java.util.Spliterator<java.lang.Object> objSpliterator9 = hashCodeAndEqualsSafeSet0.spliterator();
        java.lang.Object[] objArray10 = hashCodeAndEqualsSafeSet0.toArray();
        org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner cleaner34 = org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner.INLINE;
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 10, (byte) 100, 1.0d, 1, (-1.0f), 10.0f, (byte) 1, 1, 10.0f, (-1.0d), (short) -1, "hi!", 1.0d, (byte) 1, 1.0f, (short) -1, 10, 10L, false, (byte) -1, (-1L), false, (-1), cleaner34 };
        java.util.LinkedHashSet<java.lang.Object> objSet36 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet36, objArray35);
        java.util.Spliterator<java.lang.Object> objSpliterator38 = objSet36.spliterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet39 = org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.of((java.lang.Iterable<java.lang.Object>) objSet36);
        boolean boolean41 = hashCodeAndEqualsSafeSet39.contains((java.lang.Object) (short) 10);
        boolean boolean42 = hashCodeAndEqualsSafeSet39.isEmpty();
        boolean boolean43 = hashCodeAndEqualsSafeSet0.removeAll((java.util.Collection<java.lang.Object>) hashCodeAndEqualsSafeSet39);
        java.lang.Object obj44 = org.mockito.internal.util.collections.Iterables.firstOf((java.lang.Iterable<java.lang.Object>) hashCodeAndEqualsSafeSet0);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objSet36 and hashCodeAndEqualsSafeSet39.", objSet36.equals(hashCodeAndEqualsSafeSet39) == hashCodeAndEqualsSafeSet39.equals(objSet36));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.mockito.internal.util.concurrent.WeakConcurrentSet.Cleaner cleaner0 = org.mockito.internal.util.concurrent.WeakConcurrentSet.Cleaner.INLINE;
        org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String> strWeakConcurrentSet1 = new org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String>(cleaner0);
        org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String> strWeakConcurrentSet3 = org.mockito.internal.util.Checks.checkNotNull(strWeakConcurrentSet1, "");
        boolean boolean5 = strWeakConcurrentSet1.remove("");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet0 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.lang.Iterable<java.lang.Object> objIterable2 = org.mockito.internal.util.Checks.checkItemsNotNull((java.lang.Iterable<java.lang.Object>) hashCodeAndEqualsSafeSet0, "");
        org.mockito.internal.util.concurrent.WeakConcurrentMap<java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>, java.lang.Object> cleanerEnumWeakConcurrentMap4 = new org.mockito.internal.util.concurrent.WeakConcurrentMap<java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>, java.lang.Object>(false);
        org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner cleaner5 = org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner.INLINE;
        java.lang.Object obj6 = cleanerEnumWeakConcurrentMap4.get((java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>) cleaner5);
        cleanerEnumWeakConcurrentMap4.expungeStaleEntries();
        boolean boolean8 = hashCodeAndEqualsSafeSet0.add((java.lang.Object) cleanerEnumWeakConcurrentMap4);
        java.util.Spliterator<java.lang.Object> objSpliterator9 = hashCodeAndEqualsSafeSet0.spliterator();
        java.lang.Object[] objArray10 = hashCodeAndEqualsSafeSet0.toArray();
        org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner cleaner34 = org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner.INLINE;
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 10, (byte) 100, 1.0d, 1, (-1.0f), 10.0f, (byte) 1, 1, 10.0f, (-1.0d), (short) -1, "hi!", 1.0d, (byte) 1, 1.0f, (short) -1, 10, 10L, false, (byte) -1, (-1L), false, (-1), cleaner34 };
        java.util.LinkedHashSet<java.lang.Object> objSet36 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet36, objArray35);
        java.util.Spliterator<java.lang.Object> objSpliterator38 = objSet36.spliterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet39 = org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.of((java.lang.Iterable<java.lang.Object>) objSet36);
        boolean boolean41 = hashCodeAndEqualsSafeSet39.contains((java.lang.Object) (short) 10);
        boolean boolean42 = hashCodeAndEqualsSafeSet39.isEmpty();
        boolean boolean43 = hashCodeAndEqualsSafeSet0.removeAll((java.util.Collection<java.lang.Object>) hashCodeAndEqualsSafeSet39);
        java.util.Spliterator<java.lang.Object> objSpliterator44 = hashCodeAndEqualsSafeSet0.spliterator();
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objSet36 and hashCodeAndEqualsSafeSet39.", objSet36.equals(hashCodeAndEqualsSafeSet39) == hashCodeAndEqualsSafeSet39.equals(objSet36));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.mockito.internal.util.concurrent.WeakConcurrentSet.Cleaner cleaner0 = org.mockito.internal.util.concurrent.WeakConcurrentSet.Cleaner.INLINE;
        org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String> strWeakConcurrentSet1 = new org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String>(cleaner0);
        org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String> strWeakConcurrentSet3 = org.mockito.internal.util.Checks.checkNotNull(strWeakConcurrentSet1, "");
        java.lang.Thread thread4 = strWeakConcurrentSet1.getCleanerThread();
        boolean boolean6 = strWeakConcurrentSet1.add("");
        boolean boolean8 = strWeakConcurrentSet1.remove("");
        boolean boolean10 = strWeakConcurrentSet1.remove("<<custom argument matcher><[]>null>");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.mockito.internal.util.concurrent.WeakConcurrentSet.Cleaner cleaner0 = org.mockito.internal.util.concurrent.WeakConcurrentSet.Cleaner.INLINE;
        org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String> strWeakConcurrentSet1 = new org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String>(cleaner0);
        org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String> strWeakConcurrentSet3 = org.mockito.internal.util.Checks.checkNotNull(strWeakConcurrentSet1, "");
        java.lang.Thread thread4 = strWeakConcurrentSet1.getCleanerThread();
        boolean boolean6 = strWeakConcurrentSet1.add("");
        boolean boolean8 = strWeakConcurrentSet1.remove("");
        boolean boolean10 = strWeakConcurrentSet1.remove("hi!");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.mockito.internal.util.concurrent.WeakConcurrentSet.Cleaner cleaner0 = org.mockito.internal.util.concurrent.WeakConcurrentSet.Cleaner.INLINE;
        org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String> strWeakConcurrentSet1 = new org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String>(cleaner0);
        org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String> strWeakConcurrentSet3 = org.mockito.internal.util.Checks.checkNotNull(strWeakConcurrentSet1, "");
        java.util.Iterator<java.lang.String> strItor4 = strWeakConcurrentSet3.iterator();
        int int5 = strWeakConcurrentSet3.approximateSize();
        boolean boolean7 = strWeakConcurrentSet3.remove("class org.mockito.internal.util.concurrent.WeakConcurrentMap");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner cleaner25 = org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner.INLINE;
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 10, (byte) 100, 1.0d, 1, (-1.0f), 10.0f, (byte) 1, 1, 10.0f, (-1.0d), (short) -1, "hi!", 1.0d, (byte) 1, 1.0f, (short) -1, 10, 10L, false, (byte) -1, (-1L), false, (-1), cleaner25 };
        java.util.LinkedHashSet<java.lang.Object> objSet27 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet27, objArray26);
        java.util.Spliterator<java.lang.Object> objSpliterator29 = objSet27.spliterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet30 = org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.of((java.lang.Iterable<java.lang.Object>) objSet27);
        boolean boolean31 = hashCodeAndEqualsSafeSet30.isEmpty();
        java.lang.Object obj32 = org.mockito.internal.util.JavaEightUtil.emptyOptionalLong();
        boolean boolean33 = hashCodeAndEqualsSafeSet30.remove(obj32);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet34 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet36 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet34, "hi!");
        int int37 = hashCodeAndEqualsSafeSet36.size();
        boolean boolean38 = hashCodeAndEqualsSafeSet30.equals((java.lang.Object) hashCodeAndEqualsSafeSet36);
        java.lang.String str39 = org.mockito.internal.util.StringUtil.join("[]10\n1.0\n1\n1.0\n1\n10\n-1\n-1.0\n-1\n100\n-1.0\nhi!\n-1\n10.0\nINLINE\nfalse\n10\n-1", "<custom argument matcher><[]>null", (java.util.Collection<java.lang.Object>) hashCodeAndEqualsSafeSet36);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objSet27 and hashCodeAndEqualsSafeSet30.", objSet27.equals(hashCodeAndEqualsSafeSet30) == hashCodeAndEqualsSafeSet30.equals(objSet27));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.mockito.internal.util.concurrent.WeakConcurrentSet.Cleaner cleaner0 = org.mockito.internal.util.concurrent.WeakConcurrentSet.Cleaner.INLINE;
        org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String> strWeakConcurrentSet1 = new org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String>(cleaner0);
        org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String> strWeakConcurrentSet3 = org.mockito.internal.util.Checks.checkNotNull(strWeakConcurrentSet1, "");
        java.util.Iterator<java.lang.String> strItor4 = strWeakConcurrentSet3.iterator();
        boolean boolean6 = strWeakConcurrentSet3.remove("hi!");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.mockito.internal.util.concurrent.WeakConcurrentSet.Cleaner cleaner0 = org.mockito.internal.util.concurrent.WeakConcurrentSet.Cleaner.INLINE;
        org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String> strWeakConcurrentSet1 = new org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String>(cleaner0);
        org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String> strWeakConcurrentSet3 = org.mockito.internal.util.Checks.checkNotNull(strWeakConcurrentSet1, "");
        strWeakConcurrentSet3.expungeStaleEntries();
        boolean boolean6 = strWeakConcurrentSet3.remove("<custom argument matcher><[]>null");
    }  */
} 

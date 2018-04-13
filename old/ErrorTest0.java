import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

 /*   @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap0 = new org.mockito.internal.util.concurrent.WeakConcurrentMap();
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap2 = org.mockito.internal.util.Checks.checkItemsNotNull(weakConcurrentMap0, "hi!");
        org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner cleaner26 = org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner.INLINE;
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 10, (byte) 100, 1.0d, 1, (-1.0f), 10.0f, (byte) 1, 1, 10.0f, (-1.0d), (short) -1, "hi!", 1.0d, (byte) 1, 1.0f, (short) -1, 10, 10L, false, (byte) -1, (-1L), false, (-1), cleaner26 };
        java.util.LinkedHashSet<java.lang.Object> objSet28 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet28, objArray27);
        java.util.Spliterator<java.lang.Object> objSpliterator30 = objSet28.spliterator();
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap31 = org.mockito.internal.util.concurrent.WeakConcurrentMap.of((java.lang.Iterable<java.lang.Object>) objSet28);
        boolean boolean32 = weakConcurrentMap31.isEmpty();
        int int33 = weakConcurrentMap31.size();
        boolean boolean34 = weakConcurrentMap0.containsAll((java.util.Collection<java.lang.Object>) weakConcurrentMap31);
        org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner cleaner58 = org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner.INLINE;
        java.lang.Object[] objArray59 = new java.lang.Object[] { (short) 10, (byte) 100, 1.0d, 1, (-1.0f), 10.0f, (byte) 1, 1, 10.0f, (-1.0d), (short) -1, "hi!", 1.0d, (byte) 1, 1.0f, (short) -1, 10, 10L, false, (byte) -1, (-1L), false, (-1), cleaner58 };
        java.util.LinkedHashSet<java.lang.Object> objSet60 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet60, objArray59);
        java.util.Spliterator<java.lang.Object> objSpliterator62 = objSet60.spliterator();
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap63 = org.mockito.internal.util.concurrent.WeakConcurrentMap.of((java.lang.Iterable<java.lang.Object>) objSet60);
        boolean boolean64 = weakConcurrentMap0.retainAll((java.util.Collection<java.lang.Object>) weakConcurrentMap63);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objSet28 and weakConcurrentMap31.", objSet28.equals(weakConcurrentMap31) == weakConcurrentMap31.equals(objSet28));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner cleaner23 = org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner.INLINE;
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 10, (byte) 100, 1.0d, 1, (-1.0f), 10.0f, (byte) 1, 1, 10.0f, (-1.0d), (short) -1, "hi!", 1.0d, (byte) 1, 1.0f, (short) -1, 10, 10L, false, (byte) -1, (-1L), false, (-1), cleaner23 };
        java.util.LinkedHashSet<java.lang.Object> objSet25 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet25, objArray24);
        java.util.Spliterator<java.lang.Object> objSpliterator27 = objSet25.spliterator();
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap28 = org.mockito.internal.util.concurrent.WeakConcurrentMap.of((java.lang.Iterable<java.lang.Object>) objSet25);
        boolean boolean29 = weakConcurrentMap28.isEmpty();
        java.lang.Object obj30 = org.mockito.internal.util.JavaEightUtil.emptyOptionalLong();
        boolean boolean31 = weakConcurrentMap28.remove(obj30);
        org.mockito.internal.util.reflection.FieldInitializationReport fieldInitializationReport34 = new org.mockito.internal.util.reflection.FieldInitializationReport((java.lang.Object) boolean31, false, false);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objSet25 and weakConcurrentMap28.", objSet25.equals(weakConcurrentMap28) == weakConcurrentMap28.equals(objSet25));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner cleaner23 = org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner.INLINE;
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 10, (byte) 100, 1.0d, 1, (-1.0f), 10.0f, (byte) 1, 1, 10.0f, (-1.0d), (short) -1, "hi!", 1.0d, (byte) 1, 1.0f, (short) -1, 10, 10L, false, (byte) -1, (-1L), false, (-1), cleaner23 };
        java.util.LinkedHashSet<java.lang.Object> objSet25 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet25, objArray24);
        java.util.Spliterator<java.lang.Object> objSpliterator27 = objSet25.spliterator();
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap28 = org.mockito.internal.util.concurrent.WeakConcurrentMap.of((java.lang.Iterable<java.lang.Object>) objSet25);
        boolean boolean30 = weakConcurrentMap28.contains((java.lang.Object) (short) 10);
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap31 = new org.mockito.internal.util.concurrent.WeakConcurrentMap();
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap33 = org.mockito.internal.util.Checks.checkItemsNotNull(weakConcurrentMap31, "hi!");
        int int34 = weakConcurrentMap33.size();
        java.util.Spliterator<java.lang.Object> objSpliterator35 = weakConcurrentMap33.spliterator();
        boolean boolean36 = weakConcurrentMap28.containsAll((java.util.Collection<java.lang.Object>) weakConcurrentMap33);
        weakConcurrentMap33.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objSet25 and weakConcurrentMap28.", objSet25.equals(weakConcurrentMap28) == weakConcurrentMap28.equals(objSet25));
    }
*/
    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.mockito.internal.util.concurrent.WeakConcurrentSet.Cleaner cleaner0 = org.mockito.internal.util.concurrent.WeakConcurrentSet.Cleaner.INLINE;
        org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String> strWeakConcurrentSet1 = new org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String>(cleaner0);
        boolean boolean3 = strWeakConcurrentSet1.remove("");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.mockito.internal.util.concurrent.WeakConcurrentSet.Cleaner cleaner0 = org.mockito.internal.util.concurrent.WeakConcurrentSet.Cleaner.INLINE;
        org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String> strWeakConcurrentSet1 = new org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String>(cleaner0);
        org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String> strWeakConcurrentSet3 = org.mockito.internal.util.Checks.checkNotNull(strWeakConcurrentSet1, "");
        boolean boolean5 = strWeakConcurrentSet3.remove("");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap0 = new org.mockito.internal.util.concurrent.WeakConcurrentMap();
        java.lang.Iterable<java.lang.Object> objIterable2 = org.mockito.internal.util.Checks.checkItemsNotNull((java.lang.Iterable<java.lang.Object>) weakConcurrentMap0, "");
        org.mockito.internal.util.concurrent.WeakConcurrentMap<java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>, java.lang.Object> cleanerEnumWeakConcurrentMap4 = new org.mockito.internal.util.concurrent.WeakConcurrentMap<java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>, java.lang.Object>(false);
        org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner cleaner5 = org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner.INLINE;
        java.lang.Object obj6 = cleanerEnumWeakConcurrentMap4.get((java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>) cleaner5);
        cleanerEnumWeakConcurrentMap4.expungeStaleEntries();
        boolean boolean8 = weakConcurrentMap0.add((java.lang.Object) cleanerEnumWeakConcurrentMap4);
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap9 = new org.mockito.internal.util.concurrent.WeakConcurrentMap();
        org.mockito.internal.util.concurrent.WeakConcurrentMap<java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>, java.lang.Object> cleanerEnumWeakConcurrentMap11 = new org.mockito.internal.util.concurrent.WeakConcurrentMap<java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>, java.lang.Object>(false);
        boolean boolean12 = weakConcurrentMap9.add((java.lang.Object) cleanerEnumWeakConcurrentMap11);
        boolean boolean13 = weakConcurrentMap0.add((java.lang.Object) cleanerEnumWeakConcurrentMap11);
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap14 = new org.mockito.internal.util.concurrent.WeakConcurrentMap();
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap16 = org.mockito.internal.util.Checks.checkItemsNotNull(weakConcurrentMap14, "hi!");
        int int17 = weakConcurrentMap16.size();
        java.util.Spliterator<java.lang.Object> objSpliterator18 = weakConcurrentMap16.spliterator();
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap19 = new org.mockito.internal.util.concurrent.WeakConcurrentMap();
        java.util.Iterator<java.lang.Object> objItor20 = weakConcurrentMap19.iterator();
        java.util.Iterator<java.lang.Object> objItor21 = weakConcurrentMap19.iterator();
        weakConcurrentMap19.clear();
        org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner cleaner46 = org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner.INLINE;
        java.lang.Object[] objArray47 = new java.lang.Object[] { (short) 10, (byte) 100, 1.0d, 1, (-1.0f), 10.0f, (byte) 1, 1, 10.0f, (-1.0d), (short) -1, "hi!", 1.0d, (byte) 1, 1.0f, (short) -1, 10, 10L, false, (byte) -1, (-1L), false, (-1), cleaner46 };
        java.util.LinkedHashSet<java.lang.Object> objSet48 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet48, objArray47);
        java.util.Spliterator<java.lang.Object> objSpliterator50 = objSet48.spliterator();
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap51 = org.mockito.internal.util.concurrent.WeakConcurrentMap.of((java.lang.Iterable<java.lang.Object>) objSet48);
        boolean boolean52 = weakConcurrentMap19.containsAll((java.util.Collection<java.lang.Object>) weakConcurrentMap51);
        java.lang.Iterable[] iterableArray54 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked") java.lang.Iterable<java.lang.Object>[] objIterableArray55 = (java.lang.Iterable<java.lang.Object>[]) iterableArray54;
        objIterableArray55[0] = weakConcurrentMap16;
        objIterableArray55[1] = weakConcurrentMap51;
        java.lang.Iterable<java.lang.Object>[] objIterableArray60 = weakConcurrentMap0.toArray(objIterableArray55);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objSet48 and weakConcurrentMap51.", objSet48.equals(weakConcurrentMap51) == weakConcurrentMap51.equals(objSet48));
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
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap28 = org.mockito.internal.util.concurrent.WeakConcurrentMap.of((java.lang.Iterable<java.lang.Object>) objSet25);
        boolean boolean30 = weakConcurrentMap28.contains((java.lang.Object) (short) 10);
        boolean boolean31 = weakConcurrentMap28.isEmpty();
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap32 = new org.mockito.internal.util.concurrent.WeakConcurrentMap();
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap34 = org.mockito.internal.util.Checks.checkItemsNotNull(weakConcurrentMap32, "hi!");
        org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner cleaner58 = org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner.INLINE;
        java.lang.Object[] objArray59 = new java.lang.Object[] { (short) 10, (byte) 100, 1.0d, 1, (-1.0f), 10.0f, (byte) 1, 1, 10.0f, (-1.0d), (short) -1, "hi!", 1.0d, (byte) 1, 1.0f, (short) -1, 10, 10L, false, (byte) -1, (-1L), false, (-1), cleaner58 };
        java.util.LinkedHashSet<java.lang.Object> objSet60 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet60, objArray59);
        java.util.Spliterator<java.lang.Object> objSpliterator62 = objSet60.spliterator();
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap63 = org.mockito.internal.util.concurrent.WeakConcurrentMap.of((java.lang.Iterable<java.lang.Object>) objSet60);
        boolean boolean64 = weakConcurrentMap63.isEmpty();
        int int65 = weakConcurrentMap63.size();
        boolean boolean66 = weakConcurrentMap32.containsAll((java.util.Collection<java.lang.Object>) weakConcurrentMap63);
        boolean boolean67 = weakConcurrentMap28.equals((java.lang.Object) boolean66);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objSet25 and weakConcurrentMap63.", objSet25.equals(weakConcurrentMap63) == weakConcurrentMap63.equals(objSet25));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap0 = new org.mockito.internal.util.concurrent.WeakConcurrentMap();
        java.lang.Iterable<java.lang.Object> objIterable2 = org.mockito.internal.util.Checks.checkItemsNotNull((java.lang.Iterable<java.lang.Object>) weakConcurrentMap0, "");
        org.mockito.internal.util.concurrent.WeakConcurrentMap<java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>, java.lang.Object> cleanerEnumWeakConcurrentMap4 = new org.mockito.internal.util.concurrent.WeakConcurrentMap<java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>, java.lang.Object>(false);
        org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner cleaner5 = org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner.INLINE;
        java.lang.Object obj6 = cleanerEnumWeakConcurrentMap4.get((java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>) cleaner5);
        cleanerEnumWeakConcurrentMap4.expungeStaleEntries();
        boolean boolean8 = weakConcurrentMap0.add((java.lang.Object) cleanerEnumWeakConcurrentMap4);
        java.util.Spliterator<java.lang.Object> objSpliterator9 = weakConcurrentMap0.spliterator();
        java.lang.Object[] objArray10 = weakConcurrentMap0.toArray();
        org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner cleaner34 = org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner.INLINE;
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 10, (byte) 100, 1.0d, 1, (-1.0f), 10.0f, (byte) 1, 1, 10.0f, (-1.0d), (short) -1, "hi!", 1.0d, (byte) 1, 1.0f, (short) -1, 10, 10L, false, (byte) -1, (-1L), false, (-1), cleaner34 };
        java.util.LinkedHashSet<java.lang.Object> objSet36 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet36, objArray35);
        java.util.Spliterator<java.lang.Object> objSpliterator38 = objSet36.spliterator();
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap39 = org.mockito.internal.util.concurrent.WeakConcurrentMap.of((java.lang.Iterable<java.lang.Object>) objSet36);
        boolean boolean41 = weakConcurrentMap39.contains((java.lang.Object) (short) 10);
        boolean boolean42 = weakConcurrentMap39.isEmpty();
        boolean boolean43 = weakConcurrentMap0.removeAll((java.util.Collection<java.lang.Object>) weakConcurrentMap39);
        java.lang.Object obj44 = org.mockito.internal.util.collections.Iterables.firstOf((java.lang.Iterable<java.lang.Object>) weakConcurrentMap0);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objSet36 and weakConcurrentMap39.", objSet36.equals(weakConcurrentMap39) == weakConcurrentMap39.equals(objSet36));
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
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap0 = new org.mockito.internal.util.concurrent.WeakConcurrentMap();
        java.lang.Iterable<java.lang.Object> objIterable2 = org.mockito.internal.util.Checks.checkItemsNotNull((java.lang.Iterable<java.lang.Object>) weakConcurrentMap0, "");
        org.mockito.internal.util.concurrent.WeakConcurrentMap<java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>, java.lang.Object> cleanerEnumWeakConcurrentMap4 = new org.mockito.internal.util.concurrent.WeakConcurrentMap<java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>, java.lang.Object>(false);
        org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner cleaner5 = org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner.INLINE;
        java.lang.Object obj6 = cleanerEnumWeakConcurrentMap4.get((java.lang.Enum<org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner>) cleaner5);
        cleanerEnumWeakConcurrentMap4.expungeStaleEntries();
        boolean boolean8 = weakConcurrentMap0.add((java.lang.Object) cleanerEnumWeakConcurrentMap4);
        java.util.Spliterator<java.lang.Object> objSpliterator9 = weakConcurrentMap0.spliterator();
        java.lang.Object[] objArray10 = weakConcurrentMap0.toArray();
        org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner cleaner34 = org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner.INLINE;
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 10, (byte) 100, 1.0d, 1, (-1.0f), 10.0f, (byte) 1, 1, 10.0f, (-1.0d), (short) -1, "hi!", 1.0d, (byte) 1, 1.0f, (short) -1, 10, 10L, false, (byte) -1, (-1L), false, (-1), cleaner34 };
        java.util.LinkedHashSet<java.lang.Object> objSet36 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet36, objArray35);
        java.util.Spliterator<java.lang.Object> objSpliterator38 = objSet36.spliterator();
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap39 = org.mockito.internal.util.concurrent.WeakConcurrentMap.of((java.lang.Iterable<java.lang.Object>) objSet36);
        boolean boolean41 = weakConcurrentMap39.contains((java.lang.Object) (short) 10);
        boolean boolean42 = weakConcurrentMap39.isEmpty();
        boolean boolean43 = weakConcurrentMap0.removeAll((java.util.Collection<java.lang.Object>) weakConcurrentMap39);
        java.util.Spliterator<java.lang.Object> objSpliterator44 = weakConcurrentMap0.spliterator();
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objSet36 and weakConcurrentMap39.", objSet36.equals(weakConcurrentMap39) == weakConcurrentMap39.equals(objSet36));
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
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap30 = org.mockito.internal.util.concurrent.WeakConcurrentMap.of((java.lang.Iterable<java.lang.Object>) objSet27);
        boolean boolean31 = weakConcurrentMap30.isEmpty();
        java.lang.Object obj32 = org.mockito.internal.util.JavaEightUtil.emptyOptionalLong();
        boolean boolean33 = weakConcurrentMap30.remove(obj32);
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap34 = new org.mockito.internal.util.concurrent.WeakConcurrentMap();
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap36 = org.mockito.internal.util.Checks.checkItemsNotNull(weakConcurrentMap34, "hi!");
        int int37 = weakConcurrentMap36.size();
        boolean boolean38 = weakConcurrentMap30.equals((java.lang.Object) weakConcurrentMap36);
        java.lang.String str39 = org.mockito.internal.util.StringUtil.join("[]10.0\n1.0\n1\n100\n10\nINLINE\n-1\n10\n1.0\n-1.0\nfalse\nhi!\n-1\n-1.0\n-1\n10\n1\n-1", "<custom argument matcher><[]>null", (java.util.Collection<java.lang.Object>) weakConcurrentMap36);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objSet27 and weakConcurrentMap30.", objSet27.equals(weakConcurrentMap30) == weakConcurrentMap30.equals(objSet27));
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
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap0 = new org.mockito.internal.util.concurrent.WeakConcurrentMap();
        java.util.Iterator<java.lang.Object> objItor1 = weakConcurrentMap0.iterator();
        java.util.Iterator<java.lang.Object> objItor2 = weakConcurrentMap0.iterator();
        weakConcurrentMap0.clear();
        org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner cleaner27 = org.mockito.internal.util.concurrent.DetachedThreadLocal.Cleaner.INLINE;
        java.lang.Object[] objArray28 = new java.lang.Object[] { (short) 10, (byte) 100, 1.0d, 1, (-1.0f), 10.0f, (byte) 1, 1, 10.0f, (-1.0d), (short) -1, "hi!", 1.0d, (byte) 1, 1.0f, (short) -1, 10, 10L, false, (byte) -1, (-1L), false, (-1), cleaner27 };
        java.util.LinkedHashSet<java.lang.Object> objSet29 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet29, objArray28);
        java.util.Spliterator<java.lang.Object> objSpliterator31 = objSet29.spliterator();
        org.mockito.internal.util.concurrent.WeakConcurrentMap weakConcurrentMap32 = org.mockito.internal.util.concurrent.WeakConcurrentMap.of((java.lang.Iterable<java.lang.Object>) objSet29);
        boolean boolean33 = weakConcurrentMap0.containsAll((java.util.Collection<java.lang.Object>) weakConcurrentMap32);
        org.mockito.internal.util.collections.ListUtil.Filter<java.lang.Object> objFilter34 = null;
        java.util.LinkedList<java.lang.Object> objList35 = org.mockito.internal.util.collections.ListUtil.filter((java.util.Collection<java.lang.Object>) weakConcurrentMap0, objFilter34);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objSet29 and weakConcurrentMap32.", objSet29.equals(weakConcurrentMap32) == weakConcurrentMap32.equals(objSet29));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.mockito.internal.util.concurrent.WeakConcurrentSet.Cleaner cleaner0 = org.mockito.internal.util.concurrent.WeakConcurrentSet.Cleaner.INLINE;
        org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String> strWeakConcurrentSet1 = new org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String>(cleaner0);
        org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String> strWeakConcurrentSet3 = org.mockito.internal.util.Checks.checkNotNull(strWeakConcurrentSet1, "");
        boolean boolean5 = strWeakConcurrentSet1.contains("hi!");
        strWeakConcurrentSet1.clear();
        strWeakConcurrentSet1.expungeStaleEntries();
        boolean boolean9 = strWeakConcurrentSet1.remove("<[]>");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.mockito.internal.util.concurrent.WeakConcurrentSet.Cleaner cleaner0 = org.mockito.internal.util.concurrent.WeakConcurrentSet.Cleaner.INLINE;
        org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String> strWeakConcurrentSet1 = new org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String>(cleaner0);
        org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String> strWeakConcurrentSet3 = org.mockito.internal.util.Checks.checkNotNull(strWeakConcurrentSet1, "");
        java.lang.Thread thread4 = strWeakConcurrentSet1.getCleanerThread();
        boolean boolean6 = strWeakConcurrentSet1.add("");
        boolean boolean8 = strWeakConcurrentSet1.contains("class org.mockito.internal.util.concurrent.WeakConcurrentMap");
        boolean boolean10 = strWeakConcurrentSet1.remove("");
        strWeakConcurrentSet1.expungeStaleEntries();
        java.util.Iterator<java.lang.String> strItor12 = strWeakConcurrentSet1.iterator();
        java.util.Iterator<java.lang.String> strItor13 = strWeakConcurrentSet1.iterator();
        boolean boolean15 = strWeakConcurrentSet1.add("hi!");
        boolean boolean17 = strWeakConcurrentSet1.remove("[]10.0\n1.0\n1\n100\n10\nINLINE\n-1\n10\n1.0\n-1.0\nfalse\nhi!\n-1\n-1.0\n-1\n10\n1\n-1");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.mockito.internal.util.concurrent.WeakConcurrentSet.Cleaner cleaner0 = org.mockito.internal.util.concurrent.WeakConcurrentSet.Cleaner.INLINE;
        org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String> strWeakConcurrentSet1 = new org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String>(cleaner0);
        org.mockito.internal.util.concurrent.WeakConcurrentSet<java.lang.String> strWeakConcurrentSet3 = org.mockito.internal.util.Checks.checkNotNull(strWeakConcurrentSet1, "");
        boolean boolean5 = strWeakConcurrentSet3.add("");
        strWeakConcurrentSet3.clear();
        boolean boolean8 = strWeakConcurrentSet3.remove("<custom argument matcher><[]>null");
    }
}


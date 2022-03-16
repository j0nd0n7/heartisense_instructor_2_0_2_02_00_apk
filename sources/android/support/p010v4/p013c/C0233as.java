package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.support.annotation.C0007ae;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.c.as */
class C0233as {
    C0233as() {
    }

    /* renamed from: a */
    public static Object m1455a(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: a */
    public static Object m1456a(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: a */
    public static ArrayList<String> m1458a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(view.getTransitionName());
            view.setTransitionName((String) null);
        }
        return arrayList2;
    }

    /* renamed from: a */
    public static void m1459a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* renamed from: a */
    public static void m1460a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String transitionName = view2.getTransitionName();
            arrayList4.add(transitionName);
            if (transitionName != null) {
                view2.setTransitionName((String) null);
                String str = map.get(transitionName);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        arrayList2.get(i2).setTransitionName(transitionName);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<String> arrayList6 = arrayList3;
        final ArrayList<View> arrayList7 = arrayList;
        C0328bs.m1968a(view, new Runnable() {
            public void run() {
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 < size) {
                        ((View) arrayList5.get(i2)).setTransitionName((String) arrayList6.get(i2));
                        ((View) arrayList7.get(i2)).setTransitionName((String) arrayList4.get(i2));
                        i = i2 + 1;
                    } else {
                        return;
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m1461a(View view, final ArrayList<View> arrayList, final Map<String, String> map) {
        C0328bs.m1968a(view, new Runnable() {
            public void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    String transitionName = view.getTransitionName();
                    if (transitionName != null) {
                        view.setTransitionName(C0233as.m1478b((Map<String, String>) map, transitionName));
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m1462a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: a */
    public static void m1463a(ViewGroup viewGroup, final ArrayList<View> arrayList, final Map<String, String> map) {
        C0328bs.m1968a(viewGroup, new Runnable() {
            public void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    view.setTransitionName((String) map.get(view.getTransitionName()));
                }
            }
        });
    }

    /* renamed from: a */
    public static void m1464a(Object obj, final Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() {
                public Rect onGetEpicenter(Transition transition) {
                    if (rect == null || rect.isEmpty()) {
                        return null;
                    }
                    return rect;
                }
            });
        }
    }

    /* renamed from: a */
    public static void m1465a(Object obj, View view) {
        if (view != null) {
            final Rect rect = new Rect();
            m1459a(view, rect);
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() {
                public Rect onGetEpicenter(Transition transition) {
                    return rect;
                }
            });
        }
    }

    /* renamed from: a */
    public static void m1466a(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m1471a((List<View>) targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        m1468a((Object) transitionSet, arrayList);
    }

    /* renamed from: a */
    public static void m1467a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        final Object obj5 = obj2;
        final ArrayList<View> arrayList4 = arrayList;
        final Object obj6 = obj3;
        final ArrayList<View> arrayList5 = arrayList2;
        final Object obj7 = obj4;
        final ArrayList<View> arrayList6 = arrayList3;
        ((Transition) obj).addListener(new Transition.TransitionListener() {
            public void onTransitionCancel(Transition transition) {
            }

            public void onTransitionEnd(Transition transition) {
            }

            public void onTransitionPause(Transition transition) {
            }

            public void onTransitionResume(Transition transition) {
            }

            public void onTransitionStart(Transition transition) {
                if (obj5 != null) {
                    C0233as.m1481b(obj5, (ArrayList<View>) arrayList4, (ArrayList<View>) null);
                }
                if (obj6 != null) {
                    C0233as.m1481b(obj6, (ArrayList<View>) arrayList5, (ArrayList<View>) null);
                }
                if (obj7 != null) {
                    C0233as.m1481b(obj7, (ArrayList<View>) arrayList6, (ArrayList<View>) null);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m1468a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                for (int i = 0; i < transitionCount; i++) {
                    m1468a((Object) transitionSet.getTransitionAt(i), arrayList);
                }
            } else if (!m1473a(transition) && m1474a((List) transition.getTargets())) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    transition.addTarget(arrayList.get(i2));
                }
            }
        }
    }

    /* renamed from: a */
    public static void m1469a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            m1481b((Object) transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public static void m1470a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.isTransitionGroup()) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m1470a(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    /* renamed from: a */
    private static void m1471a(List<View> list, View view) {
        int size = list.size();
        if (!m1475a(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m1475a(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m1472a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String transitionName = view.getTransitionName();
            if (transitionName != null) {
                map.put(transitionName, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m1472a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m1473a(Transition transition) {
        return !m1474a((List) transition.getTargetIds()) || !m1474a((List) transition.getTargetNames()) || !m1474a((List) transition.getTargetTypes());
    }

    /* renamed from: a */
    private static boolean m1474a(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    private static boolean m1475a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static Object m1476b(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: b */
    public static Object m1477b(Object obj, Object obj2, Object obj3) {
        Transition transition = null;
        Transition transition2 = (Transition) obj;
        Transition transition3 = (Transition) obj2;
        Transition transition4 = (Transition) obj3;
        if (transition2 != null && transition3 != null) {
            transition = new TransitionSet().addTransition(transition2).addTransition(transition3).setOrdering(1);
        } else if (transition2 != null) {
            transition = transition2;
        } else if (transition3 != null) {
            transition = transition3;
        }
        if (transition4 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition4);
        return transitionSet;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m1478b(Map<String, String> map, String str) {
        for (Map.Entry next : map.entrySet()) {
            if (str.equals(next.getValue())) {
                return (String) next.getKey();
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m1479b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: b */
    public static void m1480b(Object obj, final View view, final ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new Transition.TransitionListener() {
            public void onTransitionCancel(Transition transition) {
            }

            public void onTransitionEnd(Transition transition) {
                transition.removeListener(this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }

            public void onTransitionPause(Transition transition) {
            }

            public void onTransitionResume(Transition transition) {
            }

            public void onTransitionStart(Transition transition) {
            }
        });
    }

    /* renamed from: b */
    public static void m1481b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            for (int i = 0; i < transitionCount; i++) {
                m1481b((Object) transitionSet.getTransitionAt(i), arrayList, arrayList2);
            }
        } else if (!m1473a(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                transition.addTarget(arrayList2.get(i2));
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    /* renamed from: c */
    public static void m1482c(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }
}

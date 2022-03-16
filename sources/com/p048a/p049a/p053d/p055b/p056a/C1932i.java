package com.p048a.p049a.p053d.p055b.p056a;

import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.a.a.d.b.a.i */
class C1932i<K, V> extends TreeMap<K, V> {
    C1932i() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("( ");
        for (Map.Entry entry : entrySet()) {
            sb.append('{').append(entry.getKey()).append(':').append(entry.getValue()).append("}, ");
        }
        if (!isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        return sb.append(" )").toString();
    }
}

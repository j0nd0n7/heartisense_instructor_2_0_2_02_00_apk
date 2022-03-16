package com.imlabworld.HS_Instructor;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Environment;
import android.util.Log;

/* renamed from: com.imlabworld.HS_Instructor.q */
class C2549q extends SQLiteOpenHelper {

    /* renamed from: a */
    private static final int f9722a = 65538;

    /* renamed from: b */
    private static final String f9723b = "Setting_db";

    /* renamed from: c */
    private final Context f9724c;

    public C2549q(Context context) {
        super(context, Environment.getExternalStorageDirectory().getAbsoluteFile() + "/HeartiSense/" + f9723b, (SQLiteDatabase.CursorFactory) null, f9722a);
        this.f9724c = context;
    }

    /* renamed from: a */
    private int m14160a(SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("mode", 1);
        contentValues.put("cpr", 3);
        contentValues.put("patient", 1);
        contentValues.put("rescuer", 2);
        contentValues.put("cycle_num", 6);
        contentValues.put("manikin_dir", 1);
        contentValues.put("compression_guide", 1);
        contentValues.put("manikin_adult", 1);
        contentValues.put("manikin_child", 1);
        contentValues.put("manikin_infant", 1);
        String language = this.f9724c.getResources().getConfiguration().locale.getLanguage();
        contentValues.put("language", language.contains("ko") ? "kr" : language.contains("de") ? "de" : language.contains("es") ? "es" : language.contains("fr") ? "fr" : "en");
        contentValues.put("guideline", 8);
        contentValues.put("date", 1);
        return (int) sQLiteDatabase.insert("setting", (String) null, contentValues);
    }

    /* renamed from: b */
    private int m14161b(SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("c_pos", 1);
        contentValues.put("c_rate", 1);
        contentValues.put("c_depth", 1);
        contentValues.put("c_recoil", 1);
        contentValues.put("b_volume", 1);
        contentValues.put("b_rate", 0);
        contentValues.put("ratio", Double.valueOf(0.75d));
        return (int) sQLiteDatabase.insert("scoring_factor", (String) null, contentValues);
    }

    /* renamed from: c */
    private int m14162c(SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("s_idx", -1);
        contentValues.put("a_idx", -1);
        contentValues.put("b_idx", -1);
        contentValues.put("c_idx", -1);
        contentValues.put("d_idx", -1);
        contentValues.put("e_idx", -1);
        contentValues.put("f_idx", -1);
        return (int) sQLiteDatabase.insert("bluetooth", (String) null, contentValues);
    }

    /* renamed from: d */
    private int m14163d(SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("email", "null");
        contentValues.put("name", "null");
        contentValues.put("server_id", -1);
        return (int) sQLiteDatabase.insert("instructor", (String) null, contentValues);
    }

    /* renamed from: a */
    public int mo9619a(C2547o oVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", oVar.mo9553b());
        contentValues.put("address", oVar.mo9556c());
        contentValues.put("adult_cal", Integer.valueOf(oVar.mo9558d()));
        contentValues.put("child_cal", Integer.valueOf(oVar.mo9560e()));
        contentValues.put("infant_cal", Integer.valueOf(oVar.mo9561f()));
        return (int) writableDatabase.insert("kit", (String) null, contentValues);
    }

    /* renamed from: a */
    public C2547o mo9620a(int i) {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM kit WHERE idx = ?;", new String[]{i + ""});
        if (rawQuery == null || rawQuery.getCount() <= 0) {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        }
        rawQuery.moveToFirst();
        C2547o oVar = new C2547o(rawQuery.getInt(0), rawQuery.getString(1), rawQuery.getString(2), rawQuery.getInt(3), rawQuery.getInt(4), rawQuery.getInt(5));
        rawQuery.close();
        return oVar;
    }

    /* renamed from: a */
    public C2547o mo9621a(String str) {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM kit WHERE address = ?;", new String[]{str});
        if (rawQuery == null || rawQuery.getCount() <= 0) {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        }
        rawQuery.moveToFirst();
        C2547o oVar = new C2547o(rawQuery.getInt(0), rawQuery.getString(1), rawQuery.getString(2), rawQuery.getInt(3), rawQuery.getInt(4), rawQuery.getInt(5));
        rawQuery.close();
        return oVar;
    }

    /* renamed from: a */
    public C2552t mo9622a() {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM setting;", (String[]) null);
        if (rawQuery == null || rawQuery.getCount() <= 0) {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        }
        rawQuery.moveToFirst();
        C2552t tVar = new C2552t(rawQuery.getInt(0), rawQuery.getInt(1), rawQuery.getInt(2), rawQuery.getInt(3), rawQuery.getInt(4), rawQuery.getInt(5), rawQuery.getInt(6), rawQuery.getInt(7), rawQuery.getInt(8), rawQuery.getInt(9), rawQuery.getInt(10), rawQuery.getString(11), rawQuery.getInt(12), rawQuery.getInt(13));
        rawQuery.close();
        return tVar;
    }

    /* renamed from: a */
    public void mo9623a(C2540h hVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        int a = hVar.mo9399a();
        int c = hVar.mo9404c();
        int i = hVar.mo9403b()[0];
        int i2 = hVar.mo9403b()[1];
        int i3 = hVar.mo9403b()[2];
        int i4 = hVar.mo9403b()[3];
        int i5 = hVar.mo9403b()[4];
        int i6 = hVar.mo9403b()[5];
        ContentValues contentValues = new ContentValues();
        contentValues.put("s_idx", Integer.valueOf(c));
        contentValues.put("a_idx", Integer.valueOf(i));
        contentValues.put("b_idx", Integer.valueOf(i2));
        contentValues.put("c_idx", Integer.valueOf(i3));
        contentValues.put("d_idx", Integer.valueOf(i4));
        contentValues.put("e_idx", Integer.valueOf(i5));
        contentValues.put("f_idx", Integer.valueOf(i6));
        writableDatabase.update("bluetooth", contentValues, "idx=" + a, (String[]) null);
    }

    /* renamed from: a */
    public void mo9624a(C2546n nVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        int a = nVar.mo9542a();
        String b = nVar.mo9545b();
        int c = nVar.mo9548c();
        String d = nVar.mo9549d();
        ContentValues contentValues = new ContentValues();
        contentValues.put("email", b);
        contentValues.put("server_id", Integer.valueOf(c));
        contentValues.put("name", d);
        writableDatabase.update("instructor", contentValues, "idx=" + a, (String[]) null);
    }

    /* renamed from: a */
    public void mo9625a(C2551s sVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        int a = sVar.mo9659a();
        int b = sVar.mo9662b();
        int c = sVar.mo9664c();
        int d = sVar.mo9666d();
        int e = sVar.mo9668e();
        int f = sVar.mo9670f();
        int g = sVar.mo9672g();
        double h = sVar.mo9674h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("c_pos", Integer.valueOf(b));
        contentValues.put("c_rate", Integer.valueOf(c));
        contentValues.put("c_depth", Integer.valueOf(d));
        contentValues.put("c_recoil", Integer.valueOf(e));
        contentValues.put("b_volume", Integer.valueOf(f));
        contentValues.put("b_rate", Integer.valueOf(g));
        contentValues.put("ratio", Double.valueOf(h));
        writableDatabase.update("scoring_factor", contentValues, "idx=" + a, (String[]) null);
    }

    /* renamed from: a */
    public void mo9626a(C2552t tVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        int d = tVar.mo9684d();
        int e = tVar.mo9686e();
        int f = tVar.mo9688f();
        int g = tVar.mo9690g();
        int h = tVar.mo9692h();
        int i = tVar.mo9694i();
        int j = tVar.mo9696j();
        int k = tVar.mo9698k();
        int l = tVar.mo9700l();
        int m = tVar.mo9702m();
        int n = tVar.mo9704n();
        String o = tVar.mo9706o();
        int i2 = tVar.f9755k;
        int q = tVar.mo9709q();
        ContentValues contentValues = new ContentValues();
        contentValues.put("mode", Integer.valueOf(e));
        contentValues.put("cpr", Integer.valueOf(f));
        contentValues.put("patient", Integer.valueOf(g));
        contentValues.put("rescuer", Integer.valueOf(h));
        contentValues.put("cycle_num", Integer.valueOf(i));
        contentValues.put("manikin_dir", Integer.valueOf(j));
        contentValues.put("compression_guide", Integer.valueOf(k));
        contentValues.put("manikin_adult", Integer.valueOf(l));
        contentValues.put("manikin_child", Integer.valueOf(m));
        contentValues.put("manikin_infant", Integer.valueOf(n));
        contentValues.put("language", o);
        contentValues.put("guideline", Integer.valueOf(i2));
        contentValues.put("date", Integer.valueOf(q));
        writableDatabase.update("setting", contentValues, "idx=" + d, (String[]) null);
    }

    /* renamed from: b */
    public C2551s mo9627b() {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM scoring_factor;", (String[]) null);
        if (rawQuery != null && rawQuery.getCount() > 0) {
            rawQuery.moveToFirst();
            C2551s sVar = new C2551s(rawQuery.getInt(0), rawQuery.getInt(1), rawQuery.getInt(2), rawQuery.getInt(3), rawQuery.getInt(4), rawQuery.getInt(5), rawQuery.getInt(6), rawQuery.getDouble(7));
            rawQuery.close();
            return sVar;
        } else if (rawQuery == null) {
            return null;
        } else {
            rawQuery.close();
            return null;
        }
    }

    /* renamed from: b */
    public void mo9628b(C2547o oVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        int a = oVar.mo9550a();
        String b = oVar.mo9553b();
        String c = oVar.mo9556c();
        int d = oVar.mo9558d();
        int e = oVar.mo9560e();
        int f = oVar.mo9561f();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", b);
        contentValues.put("address", c);
        contentValues.put("adult_cal", Integer.valueOf(d));
        contentValues.put("child_cal", Integer.valueOf(e));
        contentValues.put("infant_cal", Integer.valueOf(f));
        writableDatabase.update("kit", contentValues, "idx=" + a, (String[]) null);
    }

    /* renamed from: c */
    public C2540h mo9629c() {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM bluetooth;", (String[]) null);
        if (rawQuery == null || rawQuery.getCount() <= 0) {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        }
        rawQuery.moveToFirst();
        int i = rawQuery.getInt(0);
        int i2 = rawQuery.getInt(1);
        C2540h hVar = new C2540h(i, new int[]{rawQuery.getInt(2), rawQuery.getInt(3), rawQuery.getInt(4), rawQuery.getInt(5), rawQuery.getInt(6), rawQuery.getInt(7)}, i2);
        rawQuery.close();
        return hVar;
    }

    /* renamed from: d */
    public C2546n mo9630d() {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM instructor;", (String[]) null);
        if (rawQuery != null && rawQuery.getCount() > 0) {
            rawQuery.moveToFirst();
            C2546n nVar = new C2546n(rawQuery.getInt(0), rawQuery.getString(1), rawQuery.getInt(2), rawQuery.getString(3));
            rawQuery.close();
            return nVar;
        } else if (rawQuery == null) {
            return null;
        } else {
            rawQuery.close();
            return null;
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE setting(idx INTEGER PRIMARY KEY AUTOINCREMENT, mode INTEGER, cpr INTEGER, patient INTEGER, rescuer INTEGER, cycle_num INTEGER, manikin_dir INTEGER, compression_guide INTEGER, manikin_adult INTEGER, manikin_child INTEGER, manikin_infant INTEGER, language TEXT, guideline INTEGER, date INTEGER);");
        m14160a(sQLiteDatabase);
        sQLiteDatabase.execSQL("CREATE TABLE scoring_factor(idx INTEGER PRIMARY KEY AUTOINCREMENT, c_pos INTEGER, c_rate INTEGER, c_depth INTEGER, c_recoil INTEGER, b_volume INTEGER, b_rate INTEGER, ratio REAL);");
        m14161b(sQLiteDatabase);
        sQLiteDatabase.execSQL("CREATE TABLE bluetooth (idx INTEGER PRIMARY KEY AUTOINCREMENT, s_idx INTEGER, a_idx INTEGER, b_idx INTEGER, c_idx INTEGER, d_idx INTEGER, e_idx INTEGER, f_idx INTEGER);");
        m14162c(sQLiteDatabase);
        sQLiteDatabase.execSQL("CREATE TABLE instructor (idx INTEGER PRIMARY KEY AUTOINCREMENT, email TEXT, server_id INTEGER, name TEXT);");
        m14163d(sQLiteDatabase);
        sQLiteDatabase.execSQL("CREATE TABLE kit (idx INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, address INTEGER, adult_cal INTEGER, child_cal INTEGER, infant_cal INTEGER);");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Log.e("DB_onDowngrade", "DB will be downgraded from " + i + " to " + i2);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Log.e("DB_onUpgrade", "DB will be upgraded from " + i + " to " + i2);
        switch (i) {
            case 65537:
                try {
                    sQLiteDatabase.execSQL("ALTER TABLE instructor ADD COLUMN name TEXT");
                    return;
                } catch (Exception e) {
                    Log.e("DB_Manager_Record", e.getMessage());
                    return;
                }
            default:
                return;
        }
    }
}

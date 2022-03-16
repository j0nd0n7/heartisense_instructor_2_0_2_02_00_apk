package com.imlabworld.HS_Instructor;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Environment;
import android.util.Log;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.imlabworld.HS_Instructor.p */
class C2548p extends SQLiteOpenHelper {

    /* renamed from: a */
    private static final int f9720a = 65540;

    /* renamed from: b */
    private static final String f9721b = "Records_db";

    public C2548p(Context context) {
        super(context, Environment.getExternalStorageDirectory().getAbsoluteFile() + "/HeartiSense/" + f9721b, (SQLiteDatabase.CursorFactory) null, 65540);
    }

    /* renamed from: A */
    private void m14095A(int i) {
        ArrayList<C2544l> m = mo9605m(i);
        if (m != null) {
            Iterator<C2544l> it = m.iterator();
            while (it.hasNext()) {
                int a = it.next().mo9470a();
                m14096B(a);
                m14097C(a);
                m14098D(a);
                m14099E(a);
                m14100F(a);
            }
        }
        getReadableDatabase().execSQL("DELETE FROM data WHERE student_idx=?;", new String[]{i + ""});
    }

    /* renamed from: B */
    private void m14096B(int i) {
        getReadableDatabase().execSQL("DELETE FROM score WHERE data_idx=?;", new String[]{i + ""});
    }

    /* renamed from: C */
    private void m14097C(int i) {
        getReadableDatabase().execSQL("DELETE FROM cpr_cycle WHERE data_idx=?;", new String[]{i + ""});
    }

    /* renamed from: D */
    private void m14098D(int i) {
        getReadableDatabase().execSQL("DELETE FROM cpr_event WHERE data_idx=?;", new String[]{i + ""});
    }

    /* renamed from: E */
    private void m14099E(int i) {
        getReadableDatabase().execSQL("DELETE FROM adult_sheet WHERE data_idx=?;", new String[]{i + ""});
    }

    /* renamed from: F */
    private void m14100F(int i) {
        getReadableDatabase().execSQL("DELETE FROM infant_sheet WHERE data_idx=?;", new String[]{i + ""});
    }

    /* renamed from: a */
    private int m14101a(SQLiteDatabase sQLiteDatabase, C2539g gVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("class_idx", Integer.valueOf(gVar.mo9391b()));
        contentValues.put("student_idx", Integer.valueOf(gVar.mo9393c()));
        contentValues.put("is_sent", Integer.valueOf(gVar.mo9395d()));
        contentValues.put("order_num", 1);
        return (int) sQLiteDatabase.insert("assign", (String) null, contentValues);
    }

    /* renamed from: b */
    private int m14102b(SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", "Default");
        contentValues.put("is_org", 0);
        contentValues.put("server_idx", -1);
        contentValues.put("is_sent", 0);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());
        int insert = (int) sQLiteDatabase.insert("class", (String) null, contentValues);
        sQLiteDatabase.execSQL("UPDATE class SET date = '" + timestamp + "', edit_time = '" + timestamp2 + "' WHERE idx = " + insert + ";");
        return insert;
    }

    /* renamed from: x */
    private void m14103x(int i) {
        getReadableDatabase().execSQL("DELETE FROM assign WHERE class_idx=?;", new String[]{i + ""});
    }

    /* renamed from: y */
    private void m14104y(int i) {
        getReadableDatabase().execSQL("DELETE FROM assign WHERE student_idx=?;", new String[]{i + ""});
    }

    /* renamed from: z */
    private void m14105z(int i) {
        getWritableDatabase().execSQL("UPDATE data SET class_idx = 1 WHERE class_idx = " + i + ";");
    }

    /* renamed from: a */
    public int mo9562a(C2537e eVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("data_idx", Integer.valueOf(eVar.mo9335b()));
        contentValues.put("event_time", Integer.valueOf(eVar.mo9337c()));
        contentValues.put("type", Integer.valueOf(eVar.mo9339d()));
        contentValues.put("tag", Integer.valueOf(eVar.mo9341e()));
        return (int) writableDatabase.insert("action_event", (String) null, contentValues);
    }

    /* renamed from: a */
    public int mo9563a(C2538f fVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("data_idx", Integer.valueOf(fVar.mo9346b()));
        contentValues.put("precpr_1", Integer.valueOf(fVar.mo9348c()));
        contentValues.put("precpr_2", Integer.valueOf(fVar.mo9350d()));
        contentValues.put("precpr_3", Integer.valueOf(fVar.mo9352e()));
        contentValues.put("precpr_4", Integer.valueOf(fVar.mo9354f()));
        contentValues.put("precpr_5", Integer.valueOf(fVar.mo9356g()));
        contentValues.put("cpr_1", Integer.valueOf(fVar.mo9358h()));
        contentValues.put("cpr_2", Integer.valueOf(fVar.mo9360i()));
        contentValues.put("cpr_3", Integer.valueOf(fVar.mo9362j()));
        contentValues.put("cpr_4", Integer.valueOf(fVar.mo9364k()));
        contentValues.put("cpr_5", Integer.valueOf(fVar.mo9366l()));
        contentValues.put("cpr_6", Integer.valueOf(fVar.mo9368m()));
        contentValues.put("aed_1", Integer.valueOf(fVar.mo9370n()));
        contentValues.put("aed_2", Integer.valueOf(fVar.mo9372o()));
        contentValues.put("aed_3", Integer.valueOf(fVar.mo9374p()));
        contentValues.put("aed_4", Integer.valueOf(fVar.mo9376q()));
        contentValues.put("aed_5", Integer.valueOf(fVar.mo9378r()));
        contentValues.put("aed_6", Integer.valueOf(fVar.mo9380s()));
        contentValues.put("cont_cpr", Integer.valueOf(fVar.mo9382t()));
        try {
            contentValues.put("mibi1", Integer.valueOf(fVar.mo9384u()));
            contentValues.put("mibi2", Integer.valueOf(fVar.mo9386v()));
        } catch (Exception e) {
            try {
                writableDatabase.execSQL("ALTER TABLE adult_sheet ADD COLUMN mibi1 INTEGER");
            } catch (Exception e2) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE adult_sheet ADD COLUMN mibi2 INTEGER");
            } catch (Exception e3) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN mibi1 INTEGER");
            } catch (Exception e4) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN mibi2 INTEGER");
            } catch (Exception e5) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE adult_sheet ADD COLUMN check_breath_time REAL");
            } catch (Exception e6) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN check_breath_time REAL");
            } catch (Exception e7) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle1_comp_time REAL");
            } catch (Exception e8) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle1_breath_time REAL");
            } catch (Exception e9) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle2_comp_time REAL");
            } catch (Exception e10) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle2_breath_time REAL");
            } catch (Exception e11) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle3_comp_time REAL");
            } catch (Exception e12) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle3_breath_time REAL");
            } catch (Exception e13) {
            }
            contentValues.put("mibi1", Integer.valueOf(fVar.mo9384u()));
            contentValues.put("mibi2", Integer.valueOf(fVar.mo9386v()));
        }
        try {
            contentValues.put("check_breath_time", Double.valueOf(fVar.mo9388w()));
        } catch (Exception e14) {
            try {
                writableDatabase.execSQL("ALTER TABLE adult_sheet ADD COLUMN check_breath_time REAL");
            } catch (Exception e15) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN check_breath_time REAL");
            } catch (Exception e16) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle1_comp_time REAL");
            } catch (Exception e17) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle1_breath_time REAL");
            } catch (Exception e18) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle2_comp_time REAL");
            } catch (Exception e19) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle2_breath_time REAL");
            } catch (Exception e20) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle3_comp_time REAL");
            } catch (Exception e21) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle3_breath_time REAL");
            } catch (Exception e22) {
            }
            contentValues.put("check_breath_time", Double.valueOf(fVar.mo9388w()));
        }
        return (int) writableDatabase.insert("adult_sheet", (String) null, contentValues);
    }

    /* renamed from: a */
    public int mo9564a(C2539g gVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("class_idx", Integer.valueOf(gVar.mo9391b()));
        contentValues.put("student_idx", Integer.valueOf(gVar.mo9393c()));
        contentValues.put("is_sent", Integer.valueOf(gVar.mo9395d()));
        contentValues.put("order_num", Integer.valueOf(gVar.mo9397e()));
        return (int) writableDatabase.insert("assign", (String) null, contentValues);
    }

    /* renamed from: a */
    public int mo9565a(C2541i iVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("data_idx", Integer.valueOf(iVar.mo9408b()));
        contentValues.put("cycle_num", Integer.valueOf(iVar.mo9411c()));
        contentValues.put("comp_num", Integer.valueOf(iVar.mo9413d()));
        contentValues.put("comp_correct_num", Integer.valueOf(iVar.mo9415e()));
        contentValues.put("comp_time", Double.valueOf(iVar.mo9417f()));
        contentValues.put("breath_num", Integer.valueOf(iVar.mo9419g()));
        contentValues.put("breath_correct_num", Integer.valueOf(iVar.mo9421h()));
        contentValues.put("hands_off_time", Double.valueOf(iVar.mo9423i()));
        contentValues.put("pos1", Integer.valueOf(iVar.mo9425j()));
        contentValues.put("pos2", Integer.valueOf(iVar.mo9427k()));
        contentValues.put("pos3", Integer.valueOf(iVar.mo9429l()));
        contentValues.put("pos4", Integer.valueOf(iVar.mo9431m()));
        contentValues.put("pos5", Integer.valueOf(iVar.mo9432n()));
        return (int) writableDatabase.insert("cpr_cycle", (String) null, contentValues);
    }

    /* renamed from: a */
    public int mo9566a(C2542j jVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("data_idx", Integer.valueOf(jVar.mo9436b()));
        contentValues.put("event_num", Integer.valueOf(jVar.mo9439c()));
        contentValues.put("event_time", Double.valueOf(jVar.mo9441d()));
        contentValues.put("cycle_num", Integer.valueOf(jVar.mo9443e()));
        contentValues.put("stroke_num", Integer.valueOf(jVar.mo9445f()));
        contentValues.put("depth", Integer.valueOf(jVar.mo9447g()));
        contentValues.put("recoil", Integer.valueOf(jVar.mo9449h()));
        contentValues.put("volume", Integer.valueOf(jVar.mo9451i()));
        contentValues.put("rate", Double.valueOf(jVar.mo9453j()));
        contentValues.put("is_comp", Integer.valueOf(jVar.mo9454k()));
        return (int) writableDatabase.insert("cpr_event", (String) null, contentValues);
    }

    /* renamed from: a */
    public int mo9567a(C2543k kVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", kVar.mo9459b());
        contentValues.put("is_org", Integer.valueOf(kVar.mo9466e()));
        contentValues.put("server_idx", Integer.valueOf(kVar.mo9467f()));
        contentValues.put("is_sent", Integer.valueOf(kVar.mo9468g()));
        Timestamp c = kVar.mo9462c();
        Timestamp d = kVar.mo9464d();
        int insert = (int) writableDatabase.insert("class", (String) null, contentValues);
        writableDatabase.execSQL("UPDATE class SET date = '" + c + "', edit_time = '" + d + "' WHERE idx = " + insert + ";");
        return insert;
    }

    /* renamed from: a */
    public int mo9568a(C2544l lVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("class_idx", Integer.valueOf(lVar.mo9473b()));
        contentValues.put("student_idx", Integer.valueOf(lVar.mo9475c()));
        contentValues.put("pass", Integer.valueOf(lVar.mo9477d()));
        contentValues.put("manikin_type", Integer.valueOf(lVar.mo9481f()));
        contentValues.put("patient_type", Integer.valueOf(lVar.mo9483g()));
        contentValues.put("cpr_standard", Integer.valueOf(lVar.mo9485h()));
        contentValues.put("rescuer_type", Integer.valueOf(lVar.mo9487i()));
        contentValues.put("is_test", Integer.valueOf(lVar.mo9489j()));
        contentValues.put("server_idx", Integer.valueOf(lVar.mo9491k()));
        contentValues.put("is_sent", Integer.valueOf(lVar.mo9493l()));
        return (int) writableDatabase.insert("data", (String) null, contentValues);
    }

    /* renamed from: a */
    public int mo9569a(C2545m mVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("data_idx", Integer.valueOf(mVar.mo9498b()));
        contentValues.put("precpr_1", Integer.valueOf(mVar.mo9501c()));
        contentValues.put("precpr_2", Integer.valueOf(mVar.mo9504d()));
        contentValues.put("precpr_3", Integer.valueOf(mVar.mo9507e()));
        contentValues.put("precpr_4", Integer.valueOf(mVar.mo9510f()));
        contentValues.put("precpr_5", Integer.valueOf(mVar.mo9513g()));
        contentValues.put("cycle1_comp", Integer.valueOf(mVar.mo9516h()));
        contentValues.put("cycle1_breath", Integer.valueOf(mVar.mo9518i()));
        contentValues.put("cycle2_comp", Integer.valueOf(mVar.mo9520j()));
        contentValues.put("cycle2_breath", Integer.valueOf(mVar.mo9522k()));
        contentValues.put("cycle2_hot", Integer.valueOf(mVar.mo9524l()));
        contentValues.put("cycle3_comp", Integer.valueOf(mVar.mo9526m()));
        contentValues.put("cycle3_breath", Integer.valueOf(mVar.mo9528n()));
        try {
            contentValues.put("mibi1", Integer.valueOf(mVar.mo9530o()));
            contentValues.put("mibi2", Integer.valueOf(mVar.mo9532p()));
        } catch (Exception e) {
            try {
                writableDatabase.execSQL("ALTER TABLE adult_sheet ADD COLUMN mibi1 INTEGER");
            } catch (Exception e2) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE adult_sheet ADD COLUMN mibi2 INTEGER");
            } catch (Exception e3) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN mibi1 INTEGER");
            } catch (Exception e4) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN mibi2 INTEGER");
            } catch (Exception e5) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE adult_sheet ADD COLUMN check_breath_time REAL");
            } catch (Exception e6) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN check_breath_time REAL");
            } catch (Exception e7) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle1_comp_time REAL");
            } catch (Exception e8) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle1_breath_time REAL");
            } catch (Exception e9) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle2_comp_time REAL");
            } catch (Exception e10) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle2_breath_time REAL");
            } catch (Exception e11) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle3_comp_time REAL");
            } catch (Exception e12) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle3_breath_time REAL");
            } catch (Exception e13) {
            }
            contentValues.put("mibi1", Integer.valueOf(mVar.mo9530o()));
            contentValues.put("mibi2", Integer.valueOf(mVar.mo9532p()));
        }
        try {
            contentValues.put("check_breath_time", Double.valueOf(mVar.mo9534q()));
            contentValues.put("cycle1_comp_time", Double.valueOf(mVar.mo9535r()));
            contentValues.put("cycle1_breath_time", Double.valueOf(mVar.mo9536s()));
            contentValues.put("cycle2_comp_time", Double.valueOf(mVar.mo9537t()));
            contentValues.put("cycle2_breath_time", Double.valueOf(mVar.mo9539u()));
            contentValues.put("cycle3_comp_time", Double.valueOf(mVar.mo9540v()));
            contentValues.put("cycle3_breath_time", Double.valueOf(mVar.mo9541w()));
        } catch (Exception e14) {
            try {
                writableDatabase.execSQL("ALTER TABLE adult_sheet ADD COLUMN check_breath_time REAL");
            } catch (Exception e15) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN check_breath_time REAL");
            } catch (Exception e16) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle1_comp_time REAL");
            } catch (Exception e17) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle1_breath_time REAL");
            } catch (Exception e18) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle2_comp_time REAL");
            } catch (Exception e19) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle2_breath_time REAL");
            } catch (Exception e20) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle3_comp_time REAL");
            } catch (Exception e21) {
            }
            try {
                writableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle3_breath_time REAL");
            } catch (Exception e22) {
            }
            contentValues.put("check_breath_time", Double.valueOf(mVar.mo9534q()));
            contentValues.put("cycle1_comp_time", Double.valueOf(mVar.mo9535r()));
            contentValues.put("cycle1_breath_time", Double.valueOf(mVar.mo9536s()));
            contentValues.put("cycle2_comp_time", Double.valueOf(mVar.mo9537t()));
            contentValues.put("cycle2_breath_time", Double.valueOf(mVar.mo9539u()));
            contentValues.put("cycle3_comp_time", Double.valueOf(mVar.mo9540v()));
            contentValues.put("cycle3_breath_time", Double.valueOf(mVar.mo9541w()));
        }
        return (int) writableDatabase.insert("infant_sheet", (String) null, contentValues);
    }

    /* renamed from: a */
    public int mo9570a(C2550r rVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("data_idx", Integer.valueOf(rVar.mo9637b()));
        contentValues.put("overall", Double.valueOf(rVar.mo9640c()));
        contentValues.put("comp", Double.valueOf(rVar.mo9642d()));
        contentValues.put("breath", Double.valueOf(rVar.mo9644e()));
        contentValues.put("fraction", Double.valueOf(rVar.mo9646f()));
        contentValues.put("comp_depth", Double.valueOf(rVar.mo9648g()));
        contentValues.put("comp_rate", Double.valueOf(rVar.mo9650h()));
        contentValues.put("comp_recoil", Double.valueOf(rVar.mo9652i()));
        contentValues.put("comp_position", Double.valueOf(rVar.mo9654j()));
        contentValues.put("breath_volume", Double.valueOf(rVar.mo9656k()));
        contentValues.put("breath_rate", Double.valueOf(rVar.mo9657l()));
        return (int) writableDatabase.insert("score", (String) null, contentValues);
    }

    /* renamed from: a */
    public int mo9571a(C2553u uVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", uVar.mo9718c());
        contentValues.put("email", uVar.mo9722d());
        contentValues.put("phone", uVar.mo9723e());
        contentValues.put("server_idx", Integer.valueOf(uVar.mo9724f()));
        contentValues.put("is_sent", Integer.valueOf(uVar.mo9725g()));
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        int insert = (int) writableDatabase.insert("student", (String) null, contentValues);
        writableDatabase.execSQL("UPDATE student SET edit_time = '" + timestamp + "' WHERE idx = " + insert + ";");
        return insert;
    }

    /* renamed from: a */
    public ArrayList<C2543k> mo9572a() {
        ArrayList<C2543k> arrayList = new ArrayList<>();
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM class ORDER BY idx DESC;", (String[]) null);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                do {
                    arrayList.add(new C2543k(rawQuery.getInt(0), rawQuery.getString(1), Timestamp.valueOf(rawQuery.getString(2)), Timestamp.valueOf(rawQuery.getString(3)), rawQuery.getInt(4), rawQuery.getInt(5), rawQuery.getInt(6)));
                } while (rawQuery.moveToNext());
                rawQuery.close();
                return arrayList;
            } else if (rawQuery == null) {
                return null;
            } else {
                rawQuery.close();
                return null;
            }
        } else if (rawQuery == null) {
            return null;
        } else {
            rawQuery.close();
            return null;
        }
    }

    /* renamed from: a */
    public ArrayList<C2544l> mo9573a(int i, int i2, int i3) {
        ArrayList<C2544l> arrayList = new ArrayList<>();
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM data WHERE student_idx = ? and patient_type = ? and is_test = ?;", new String[]{i + "", i2 + "", i3 + ""});
        if (rawQuery == null) {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        } else if (rawQuery.moveToFirst()) {
            do {
                arrayList.add(new C2544l(rawQuery.getInt(0), rawQuery.getInt(1), rawQuery.getInt(2), rawQuery.getInt(3), Timestamp.valueOf(rawQuery.getString(4)), rawQuery.getInt(5), rawQuery.getInt(6), rawQuery.getInt(7), rawQuery.getInt(8), rawQuery.getInt(9), rawQuery.getInt(10), rawQuery.getInt(11)));
            } while (rawQuery.moveToNext());
            rawQuery.close();
            return arrayList;
        } else {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        }
    }

    /* renamed from: a */
    public void mo9574a(int i) {
        getWritableDatabase().execSQL("UPDATE class SET is_sent = 1 WHERE idx = " + i + ";");
    }

    /* renamed from: a */
    public void mo9575a(int i, int i2) {
        getWritableDatabase().execSQL("UPDATE class SET server_idx = " + i2 + " WHERE idx = " + i + ";");
    }

    /* renamed from: a */
    public void mo9576a(SQLiteDatabase sQLiteDatabase) {
        for (int i = 0; i < 50; i++) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", "익명" + i);
            contentValues.put("email", "익명" + i);
            contentValues.put("phone", "익명" + i);
            contentValues.put("server_idx", -1);
            contentValues.put("is_sent", 0);
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            int insert = (int) sQLiteDatabase.insert("student", (String) null, contentValues);
            m14101a(sQLiteDatabase, new C2539g(1, insert, 0, 1));
            sQLiteDatabase.execSQL("UPDATE student SET edit_time = '" + timestamp + "' WHERE idx = " + insert + ";");
        }
    }

    /* renamed from: b */
    public int mo9577b(C2553u uVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", uVar.mo9718c());
        contentValues.put("email", uVar.mo9722d());
        contentValues.put("phone", uVar.mo9723e());
        contentValues.put("server_idx", Integer.valueOf(uVar.mo9724f()));
        contentValues.put("is_sent", Integer.valueOf(uVar.mo9725g()));
        Timestamp h = uVar.mo9726h();
        int insert = (int) writableDatabase.insert("student", (String) null, contentValues);
        writableDatabase.execSQL("UPDATE student SET edit_time = '" + h + "' WHERE idx = " + insert + ";");
        return insert;
    }

    /* renamed from: b */
    public ArrayList<C2543k> mo9578b() {
        ArrayList<C2543k> arrayList = new ArrayList<>();
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM class WHERE is_sent = 0 ORDER BY idx DESC;", (String[]) null);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                do {
                    arrayList.add(new C2543k(rawQuery.getInt(0), rawQuery.getString(1), Timestamp.valueOf(rawQuery.getString(2)), Timestamp.valueOf(rawQuery.getString(3)), rawQuery.getInt(4), rawQuery.getInt(5), rawQuery.getInt(6)));
                } while (rawQuery.moveToNext());
                rawQuery.close();
                return arrayList;
            } else if (rawQuery == null) {
                return null;
            } else {
                rawQuery.close();
                return null;
            }
        } else if (rawQuery == null) {
            return null;
        } else {
            rawQuery.close();
            return null;
        }
    }

    /* renamed from: b */
    public ArrayList<C2544l> mo9579b(int i, int i2, int i3) {
        ArrayList<C2544l> arrayList = new ArrayList<>();
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM data WHERE is_sent = 0 and student_idx = ? and patient_type = ? and is_test = ?;", new String[]{i + "", i2 + "", i3 + ""});
        if (rawQuery == null) {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        } else if (rawQuery.moveToFirst()) {
            do {
                arrayList.add(new C2544l(rawQuery.getInt(0), rawQuery.getInt(1), rawQuery.getInt(2), rawQuery.getInt(3), Timestamp.valueOf(rawQuery.getString(4)), rawQuery.getInt(5), rawQuery.getInt(6), rawQuery.getInt(7), rawQuery.getInt(8), rawQuery.getInt(9), rawQuery.getInt(10), rawQuery.getInt(11)));
            } while (rawQuery.moveToNext());
            rawQuery.close();
            return arrayList;
        } else {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        }
    }

    /* renamed from: b */
    public void mo9580b(int i) {
        if (i != 1) {
            m14103x(i);
            m14105z(i);
            getReadableDatabase().execSQL("DELETE FROM class WHERE idx=?;", new String[]{i + ""});
        }
    }

    /* renamed from: b */
    public void mo9581b(int i, int i2) {
        getReadableDatabase().execSQL("DELETE FROM assign WHERE class_idx=? and student_idx=?;", new String[]{i + "", i2 + ""});
    }

    /* renamed from: b */
    public void mo9582b(C2539g gVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        int a = gVar.mo9389a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("class_idx", Integer.valueOf(gVar.mo9391b()));
        contentValues.put("student_idx", Integer.valueOf(gVar.mo9393c()));
        contentValues.put("is_sent", Integer.valueOf(gVar.mo9395d()));
        contentValues.put("order_num", Integer.valueOf(gVar.mo9397e()));
        writableDatabase.update("assign", contentValues, "idx =" + a, (String[]) null);
    }

    /* renamed from: b */
    public void mo9583b(C2543k kVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        int a = kVar.mo9455a();
        ContentValues contentValues = new ContentValues();
        if (a != 1) {
            contentValues.put("name", kVar.mo9459b());
        }
        contentValues.put("is_org", Integer.valueOf(kVar.mo9466e()));
        contentValues.put("server_idx", Integer.valueOf(kVar.mo9467f()));
        contentValues.put("is_sent", Integer.valueOf(kVar.mo9468g()));
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());
        writableDatabase.update("class", contentValues, "idx =" + a, (String[]) null);
        writableDatabase.execSQL("UPDATE class SET date = '" + timestamp + "', edit_time = '" + timestamp2 + "' WHERE idx = " + a + ";");
    }

    /* renamed from: b */
    public void mo9584b(C2544l lVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        int a = lVar.mo9470a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("class_idx", Integer.valueOf(lVar.mo9473b()));
        contentValues.put("student_idx", Integer.valueOf(lVar.mo9475c()));
        contentValues.put("pass", Integer.valueOf(lVar.mo9477d()));
        contentValues.put("manikin_type", Integer.valueOf(lVar.mo9481f()));
        contentValues.put("patient_type", Integer.valueOf(lVar.mo9483g()));
        contentValues.put("cpr_standard", Integer.valueOf(lVar.mo9485h()));
        contentValues.put("rescuer_type", Integer.valueOf(lVar.mo9487i()));
        contentValues.put("is_test", Integer.valueOf(lVar.mo9489j()));
        contentValues.put("server_idx", Integer.valueOf(lVar.mo9491k()));
        contentValues.put("is_sent", Integer.valueOf(lVar.mo9493l()));
        writableDatabase.update("data", contentValues, "idx =" + a, (String[]) null);
    }

    /* renamed from: c */
    public C2539g mo9585c(int i, int i2) {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM assign WHERE class_idx=? and student_idx=?;", new String[]{i + "", i2 + ""});
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                C2539g gVar = new C2539g(rawQuery.getInt(0), rawQuery.getInt(1), rawQuery.getInt(2), rawQuery.getInt(3), rawQuery.getInt(4));
                rawQuery.close();
                return gVar;
            } else if (rawQuery == null) {
                return null;
            } else {
                rawQuery.close();
                return null;
            }
        } else if (rawQuery == null) {
            return null;
        } else {
            rawQuery.close();
            return null;
        }
    }

    /* renamed from: c */
    public C2543k mo9586c(int i) {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM class WHERE idx = ?;", new String[]{i + ""});
        if (rawQuery == null || rawQuery.getCount() <= 0) {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        }
        rawQuery.moveToFirst();
        C2543k kVar = new C2543k(rawQuery.getInt(0), rawQuery.getString(1), Timestamp.valueOf(rawQuery.getString(2)), Timestamp.valueOf(rawQuery.getString(3)), rawQuery.getInt(4), rawQuery.getInt(5), rawQuery.getInt(6));
        rawQuery.close();
        return kVar;
    }

    /* renamed from: c */
    public ArrayList<C2539g> mo9587c() {
        ArrayList<C2539g> arrayList = new ArrayList<>();
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM assign WHERE is_sent=0 ORDER BY order_num ASC, idx ASC;", (String[]) null);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                do {
                    arrayList.add(new C2539g(rawQuery.getInt(0), rawQuery.getInt(1), rawQuery.getInt(2), rawQuery.getInt(3), rawQuery.getInt(4)));
                } while (rawQuery.moveToNext());
                rawQuery.close();
                return arrayList;
            } else if (rawQuery == null) {
                return null;
            } else {
                rawQuery.close();
                return null;
            }
        } else if (rawQuery == null) {
            return null;
        } else {
            rawQuery.close();
            return null;
        }
    }

    /* renamed from: c */
    public void mo9588c(C2543k kVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        int f = kVar.mo9467f();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", kVar.mo9459b());
        contentValues.put("is_org", Integer.valueOf(kVar.mo9466e()));
        contentValues.put("is_sent", Integer.valueOf(kVar.mo9468g()));
        Timestamp c = kVar.mo9462c();
        Timestamp d = kVar.mo9464d();
        writableDatabase.update("class", contentValues, "server_idx =" + f, (String[]) null);
        writableDatabase.execSQL("UPDATE class SET date = '" + c + "', edit_time = '" + d + "' WHERE server_idx = " + f + ";");
    }

    /* renamed from: c */
    public void mo9589c(C2553u uVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        int b = uVar.mo9715b();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", uVar.mo9718c());
        contentValues.put("email", uVar.mo9722d());
        contentValues.put("phone", uVar.mo9723e());
        contentValues.put("server_idx", Integer.valueOf(uVar.mo9724f()));
        contentValues.put("is_sent", Integer.valueOf(uVar.mo9725g()));
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        writableDatabase.update("student", contentValues, "idx =" + b, (String[]) null);
        writableDatabase.execSQL("UPDATE student SET edit_time = '" + timestamp + "' WHERE idx = " + b + ";");
    }

    /* renamed from: d */
    public C2543k mo9590d(int i) {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM class WHERE server_idx = ?;", new String[]{i + ""});
        if (rawQuery == null || rawQuery.getCount() <= 0) {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        }
        rawQuery.moveToFirst();
        C2543k kVar = new C2543k(rawQuery.getInt(0), rawQuery.getString(1), Timestamp.valueOf(rawQuery.getString(2)), Timestamp.valueOf(rawQuery.getString(3)), rawQuery.getInt(4), rawQuery.getInt(5), rawQuery.getInt(6));
        rawQuery.close();
        return kVar;
    }

    /* renamed from: d */
    public ArrayList<C2553u> mo9591d() {
        ArrayList<C2553u> arrayList = new ArrayList<>();
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM student WHERE is_sent = 0;", (String[]) null);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                do {
                    arrayList.add(new C2553u(rawQuery.getInt(0), rawQuery.getString(1), rawQuery.getString(2), rawQuery.getString(3), Timestamp.valueOf(rawQuery.getString(4)), rawQuery.getInt(5), rawQuery.getInt(6)));
                } while (rawQuery.moveToNext());
                rawQuery.close();
                return arrayList;
            } else if (rawQuery == null) {
                return null;
            } else {
                rawQuery.close();
                return null;
            }
        } else if (rawQuery == null) {
            return null;
        } else {
            rawQuery.close();
            return null;
        }
    }

    /* renamed from: d */
    public void mo9592d(C2553u uVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        int f = uVar.mo9724f();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", uVar.mo9718c());
        contentValues.put("email", uVar.mo9722d());
        contentValues.put("phone", uVar.mo9723e());
        contentValues.put("is_sent", Integer.valueOf(uVar.mo9725g()));
        Timestamp h = uVar.mo9726h();
        writableDatabase.update("student", contentValues, "server_idx =" + f, (String[]) null);
        writableDatabase.execSQL("UPDATE student SET edit_time = '" + h + "' WHERE server_idx = " + f + ";");
    }

    /* renamed from: d */
    public boolean mo9593d(int i, int i2) {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM assign WHERE class_idx=? and student_idx=?;", new String[]{i + "", i2 + ""});
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                do {
                } while (rawQuery.moveToNext());
                rawQuery.close();
                return true;
            } else if (rawQuery == null) {
                return false;
            } else {
                rawQuery.close();
                return false;
            }
        } else if (rawQuery == null) {
            return false;
        } else {
            rawQuery.close();
            return false;
        }
    }

    /* renamed from: e */
    public ArrayList<C2539g> mo9594e(int i) {
        ArrayList<C2539g> arrayList = new ArrayList<>();
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM assign WHERE class_idx=? ORDER BY order_num ASC, idx ASC;", new String[]{i + ""});
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                do {
                    arrayList.add(new C2539g(rawQuery.getInt(0), rawQuery.getInt(1), rawQuery.getInt(2), rawQuery.getInt(3), rawQuery.getInt(4)));
                } while (rawQuery.moveToNext());
                rawQuery.close();
                return arrayList;
            } else if (rawQuery == null) {
                return null;
            } else {
                rawQuery.close();
                return null;
            }
        } else if (rawQuery == null) {
            return null;
        } else {
            rawQuery.close();
            return null;
        }
    }

    /* renamed from: e */
    public void mo9595e(int i, int i2) {
        getWritableDatabase().execSQL("UPDATE student SET server_idx = " + i2 + " WHERE idx = " + i + ";");
    }

    /* renamed from: f */
    public ArrayList<C2539g> mo9596f(int i) {
        ArrayList<C2539g> arrayList = new ArrayList<>();
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM assign WHERE student_idx=? ORDER BY order_num ASC, idx ASC;", new String[]{i + ""});
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                do {
                    arrayList.add(new C2539g(rawQuery.getInt(0), rawQuery.getInt(1), rawQuery.getInt(2), rawQuery.getInt(3), rawQuery.getInt(4)));
                } while (rawQuery.moveToNext());
                rawQuery.close();
                return arrayList;
            } else if (rawQuery == null) {
                return null;
            } else {
                rawQuery.close();
                return null;
            }
        } else if (rawQuery == null) {
            return null;
        } else {
            rawQuery.close();
            return null;
        }
    }

    /* renamed from: f */
    public void mo9597f(int i, int i2) {
        getWritableDatabase().execSQL("UPDATE data SET student_idx = " + i2 + " WHERE idx = " + i + ";");
    }

    /* renamed from: g */
    public ArrayList<C2539g> mo9598g(int i) {
        ArrayList<C2539g> arrayList = new ArrayList<>();
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM assign WHERE class_idx=? and is_sent=0 ORDER BY order_num ASC, idx ASC;", new String[]{i + ""});
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                do {
                    arrayList.add(new C2539g(rawQuery.getInt(0), rawQuery.getInt(1), rawQuery.getInt(2), rawQuery.getInt(3), rawQuery.getInt(4)));
                } while (rawQuery.moveToNext());
                rawQuery.close();
                return arrayList;
            } else if (rawQuery == null) {
                return null;
            } else {
                rawQuery.close();
                return null;
            }
        } else if (rawQuery == null) {
            return null;
        } else {
            rawQuery.close();
            return null;
        }
    }

    /* renamed from: g */
    public void mo9599g(int i, int i2) {
        getWritableDatabase().execSQL("UPDATE data SET server_idx = " + i2 + " WHERE idx = " + i + ";");
    }

    /* renamed from: h */
    public void mo9600h(int i) {
        getWritableDatabase().execSQL("UPDATE student SET is_sent = 1 WHERE idx = " + i + ";");
    }

    /* renamed from: i */
    public void mo9601i(int i) {
        m14104y(i);
        m14095A(i);
        getReadableDatabase().execSQL("DELETE FROM student WHERE idx=?;", new String[]{i + ""});
    }

    /* renamed from: j */
    public C2553u mo9602j(int i) {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM student WHERE idx = ?;", new String[]{i + ""});
        if (rawQuery == null || rawQuery.getCount() <= 0) {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        }
        rawQuery.moveToFirst();
        C2553u uVar = new C2553u(rawQuery.getInt(0), rawQuery.getString(1), rawQuery.getString(2), rawQuery.getString(3), Timestamp.valueOf(rawQuery.getString(4)), rawQuery.getInt(5), rawQuery.getInt(6));
        rawQuery.close();
        return uVar;
    }

    /* renamed from: k */
    public C2553u mo9603k(int i) {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM student WHERE server_idx = ?;", new String[]{i + ""});
        if (rawQuery == null || rawQuery.getCount() <= 0) {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        }
        rawQuery.moveToFirst();
        C2553u uVar = new C2553u(rawQuery.getInt(0), rawQuery.getString(1), rawQuery.getString(2), rawQuery.getString(3), Timestamp.valueOf(rawQuery.getString(4)), rawQuery.getInt(5), rawQuery.getInt(6));
        rawQuery.close();
        return uVar;
    }

    /* renamed from: l */
    public void mo9604l(int i) {
        getWritableDatabase().execSQL("UPDATE data SET is_sent = 1 WHERE idx = " + i + ";");
    }

    /* renamed from: m */
    public ArrayList<C2544l> mo9605m(int i) {
        ArrayList<C2544l> arrayList = new ArrayList<>();
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM data WHERE student_idx = ?;", new String[]{i + ""});
        if (rawQuery == null) {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        } else if (rawQuery.moveToFirst()) {
            do {
                arrayList.add(new C2544l(rawQuery.getInt(0), rawQuery.getInt(1), rawQuery.getInt(2), rawQuery.getInt(3), Timestamp.valueOf(rawQuery.getString(4)), rawQuery.getInt(5), rawQuery.getInt(6), rawQuery.getInt(7), rawQuery.getInt(8), rawQuery.getInt(9), rawQuery.getInt(10), rawQuery.getInt(11)));
            } while (rawQuery.moveToNext());
            rawQuery.close();
            return arrayList;
        } else {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        }
    }

    /* renamed from: n */
    public ArrayList<C2544l> mo9606n(int i) {
        ArrayList<C2544l> arrayList = new ArrayList<>();
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM data WHERE student_idx = ? and is_sent=0;", new String[]{i + ""});
        if (rawQuery == null) {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        } else if (rawQuery.moveToFirst()) {
            do {
                arrayList.add(new C2544l(rawQuery.getInt(0), rawQuery.getInt(1), rawQuery.getInt(2), rawQuery.getInt(3), Timestamp.valueOf(rawQuery.getString(4)), rawQuery.getInt(5), rawQuery.getInt(6), rawQuery.getInt(7), rawQuery.getInt(8), rawQuery.getInt(9), rawQuery.getInt(10), rawQuery.getInt(11)));
            } while (rawQuery.moveToNext());
            rawQuery.close();
            return arrayList;
        } else {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        }
    }

    /* renamed from: o */
    public ArrayList<C2544l> mo9607o(int i) {
        ArrayList<C2544l> arrayList = new ArrayList<>();
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM data WHERE student_idx = ? ORDER BY idx DESC;", new String[]{i + ""});
        if (rawQuery == null) {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        } else if (rawQuery.moveToFirst()) {
            do {
                arrayList.add(new C2544l(rawQuery.getInt(0), rawQuery.getInt(1), rawQuery.getInt(2), rawQuery.getInt(3), Timestamp.valueOf(rawQuery.getString(4)), rawQuery.getInt(5), rawQuery.getInt(6), rawQuery.getInt(7), rawQuery.getInt(8), rawQuery.getInt(9), rawQuery.getInt(10), rawQuery.getInt(11)));
            } while (rawQuery.moveToNext());
            rawQuery.close();
            return arrayList;
        } else {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE class(idx INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, date TIMESTAMP DEFAULT (DATETIME('now', 'localtime')), edit_time TIMESTAMP DEFAULT (DATETIME('now')), is_org INTEGER, server_idx INTEGER, is_sent INTEGER DEFAULT 0);");
        m14102b(sQLiteDatabase);
        sQLiteDatabase.execSQL("CREATE TABLE assign(idx INTEGER PRIMARY KEY AUTOINCREMENT, class_idx INTEGER, student_idx INTEGER, is_sent INTEGER DEFAULT 0, order_num REAL DEFAULT 0);");
        sQLiteDatabase.execSQL("CREATE TABLE student(idx INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, email TEXT, phone TEXT, edit_time TIMESTAMP DEFAULT (DATETIME('now')), server_idx INTEGER, is_sent INTEGER DEFAULT 0);");
        sQLiteDatabase.execSQL("CREATE TABLE data(idx INTEGER PRIMARY KEY AUTOINCREMENT, class_idx INTEGER, student_idx INTEGER, pass INTEGER, time TIMESTAMP DEFAULT (DATETIME('now', 'localtime')), manikin_type INTEGER, patient_type INTEGER, cpr_standard INTEGER, rescuer_type INTEGER, is_test INTEGER, server_idx INTEGER, is_sent INTEGER DEFAULT 0);");
        sQLiteDatabase.execSQL("CREATE TABLE score(idx INTEGER PRIMARY KEY AUTOINCREMENT, data_idx INTEGER, overall REAL, comp REAL, breath REAL, fraction REAL, comp_depth REAL, comp_rate REAL, comp_recoil REAL, comp_position REAL, breath_volume REAL, breath_rate REAL);");
        sQLiteDatabase.execSQL("CREATE TABLE cpr_cycle(idx INTEGER PRIMARY KEY AUTOINCREMENT, data_idx INTEGER, cycle_num INTEGER, comp_num INTEGER, comp_correct_num INTEGER, comp_time REAL, breath_num INTEGER, breath_correct_num INTEGER, hands_off_time REAL, pos1 INTEGER, pos2 INTEGER, pos3 INTEGER, pos4 INTEGER, pos5 INTEGER);");
        sQLiteDatabase.execSQL("CREATE TABLE cpr_event(idx INTEGER PRIMARY KEY AUTOINCREMENT, data_idx INTEGER, event_num INTEGER, event_time REAL, cycle_num INTEGER, stroke_num INTEGER, depth INTEGER, recoil INTEGER, volume INTEGER, rate REAL, is_comp INTEGER);");
        sQLiteDatabase.execSQL("CREATE TABLE adult_sheet(idx INTEGER PRIMARY KEY AUTOINCREMENT, data_idx INTEGER, precpr_1 INTEGER, precpr_2 INTEGER, precpr_3 INTEGER, precpr_4 INTEGER, precpr_5 INTEGER, cpr_1 INTEGER, cpr_2 INTEGER, cpr_3 INTEGER, cpr_4 INTEGER, cpr_5 INTEGER, cpr_6 INTEGER, aed_1 INTEGER, aed_2 INTEGER, aed_3 INTEGER, aed_4 INTEGER, aed_5 INTEGER, aed_6 INTEGER, cont_cpr INTEGER, mibi1 INTEGER, mibi2 INTEGER, check_breath_time REAL);");
        sQLiteDatabase.execSQL("CREATE TABLE infant_sheet(idx INTEGER PRIMARY KEY AUTOINCREMENT, data_idx INTEGER, precpr_1 INTEGER, precpr_2 INTEGER, precpr_3 INTEGER, precpr_4 INTEGER, precpr_5 INTEGER, cycle1_comp INTEGER, cycle1_breath INTEGER, cycle2_comp INTEGER, cycle2_breath INTEGER, cycle2_hot INTEGER, cycle3_comp INTEGER, cycle3_breath INTEGER, mibi1 INTEGER, mibi2 INTEGER, check_breath_time REAL, cycle1_comp_time REAL, cycle1_breath_time REAL, cycle2_comp_time REAL, cycle2_breath_time REAL, cycle3_comp_time REAL, cycle3_breath_time REAL);");
        sQLiteDatabase.execSQL("CREATE TABLE action_event(idx INTEGER PRIMARY KEY AUTOINCREMENT, data_idx INTEGER, event_time INTEGER, type INTEGER, tag INTEGER);");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Log.e("DB_onDowngrade", "DB will be downgraded from " + i + " to " + i2);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Log.e("DB_onUpgrade", "DB will be upgraded from " + i + " to " + i2);
        switch (i) {
            case 65537:
                try {
                    sQLiteDatabase.execSQL("ALTER TABLE assign ADD COLUMN order_num REAL DEFAULT 0");
                    sQLiteDatabase.execSQL("CREATE TABLE action_event(idx INTEGER PRIMARY KEY AUTOINCREMENT, data_idx INTEGER, event_time INTEGER, type INTEGER, tag INTEGER);");
                    break;
                } catch (Exception e) {
                    Log.e("DB_Manager_Record", e.getMessage());
                    return;
                }
            case 65538:
                break;
            case 65539:
                break;
            default:
                return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE adult_sheet ADD COLUMN mibi1 INTEGER");
        sQLiteDatabase.execSQL("ALTER TABLE adult_sheet ADD COLUMN mibi2 INTEGER");
        sQLiteDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN mibi1 INTEGER");
        sQLiteDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN mibi2 INTEGER");
        sQLiteDatabase.execSQL("ALTER TABLE adult_sheet ADD COLUMN check_breath_time REAL");
        sQLiteDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN check_breath_time REAL");
        sQLiteDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle1_comp_time REAL");
        sQLiteDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle1_breath_time REAL");
        sQLiteDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle2_comp_time REAL");
        sQLiteDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle2_breath_time REAL");
        sQLiteDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle3_comp_time REAL");
        sQLiteDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle3_breath_time REAL");
    }

    /* renamed from: p */
    public C2544l mo9611p(int i) {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM data WHERE idx = ?;", new String[]{i + ""});
        if (rawQuery == null || rawQuery.getCount() <= 0) {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        }
        rawQuery.moveToFirst();
        C2544l lVar = new C2544l(rawQuery.getInt(0), rawQuery.getInt(1), rawQuery.getInt(2), rawQuery.getInt(3), Timestamp.valueOf(rawQuery.getString(4)), rawQuery.getInt(5), rawQuery.getInt(6), rawQuery.getInt(7), rawQuery.getInt(8), rawQuery.getInt(9), rawQuery.getInt(10), rawQuery.getInt(11));
        rawQuery.close();
        return lVar;
    }

    /* renamed from: q */
    public C2550r mo9612q(int i) {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM score WHERE data_idx = ?;", new String[]{i + ""});
        if (rawQuery == null || rawQuery.getCount() <= 0) {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        }
        rawQuery.moveToFirst();
        C2550r rVar = new C2550r(rawQuery.getInt(0), rawQuery.getInt(1), rawQuery.getDouble(2), rawQuery.getDouble(3), rawQuery.getDouble(4), rawQuery.getDouble(5), rawQuery.getDouble(6), rawQuery.getDouble(7), rawQuery.getDouble(8), rawQuery.getDouble(9), rawQuery.getDouble(10), rawQuery.getDouble(11));
        rawQuery.close();
        return rVar;
    }

    /* renamed from: r */
    public ArrayList<C2541i> mo9613r(int i) {
        ArrayList<C2541i> arrayList = new ArrayList<>();
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM cpr_cycle WHERE data_idx = ?;", new String[]{i + ""});
        if (rawQuery == null) {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        } else if (rawQuery.moveToFirst()) {
            do {
                arrayList.add(new C2541i(rawQuery.getInt(0), rawQuery.getInt(1), rawQuery.getInt(2), rawQuery.getInt(3), rawQuery.getInt(4), rawQuery.getDouble(5), rawQuery.getInt(6), rawQuery.getInt(7), rawQuery.getDouble(8), rawQuery.getInt(9), rawQuery.getInt(10), rawQuery.getInt(11), rawQuery.getInt(12), rawQuery.getInt(13)));
            } while (rawQuery.moveToNext());
            rawQuery.close();
            return arrayList;
        } else {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        }
    }

    /* renamed from: s */
    public ArrayList<C2542j> mo9614s(int i) {
        ArrayList<C2542j> arrayList = new ArrayList<>();
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM cpr_event WHERE data_idx = ?;", new String[]{i + ""});
        if (rawQuery == null) {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        } else if (rawQuery.moveToFirst()) {
            do {
                arrayList.add(new C2542j(rawQuery.getInt(0), rawQuery.getInt(1), rawQuery.getInt(2), rawQuery.getDouble(3), rawQuery.getInt(4), rawQuery.getInt(5), rawQuery.getInt(6), rawQuery.getInt(7), rawQuery.getInt(8), rawQuery.getDouble(9), rawQuery.getInt(10)));
            } while (rawQuery.moveToNext());
            rawQuery.close();
            return arrayList;
        } else {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        }
    }

    /* renamed from: t */
    public C2538f mo9615t(int i) {
        int i2;
        int i3;
        double d;
        SQLiteDatabase readableDatabase = getReadableDatabase();
        Cursor rawQuery = readableDatabase.rawQuery("SELECT * FROM adult_sheet WHERE data_idx = ?;", new String[]{i + ""});
        if (rawQuery == null || rawQuery.getCount() <= 0) {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        }
        rawQuery.moveToFirst();
        int i4 = rawQuery.getInt(0);
        int i5 = rawQuery.getInt(1);
        int i6 = rawQuery.getInt(2);
        int i7 = rawQuery.getInt(3);
        int i8 = rawQuery.getInt(4);
        int i9 = rawQuery.getInt(5);
        int i10 = rawQuery.getInt(6);
        int i11 = rawQuery.getInt(7);
        int i12 = rawQuery.getInt(8);
        int i13 = rawQuery.getInt(9);
        int i14 = rawQuery.getInt(10);
        int i15 = rawQuery.getInt(11);
        int i16 = rawQuery.getInt(12);
        int i17 = rawQuery.getInt(13);
        int i18 = rawQuery.getInt(14);
        int i19 = rawQuery.getInt(15);
        int i20 = rawQuery.getInt(16);
        int i21 = rawQuery.getInt(17);
        int i22 = rawQuery.getInt(18);
        int i23 = rawQuery.getInt(19);
        try {
            i2 = rawQuery.getInt(20);
            i3 = rawQuery.getInt(21);
        } catch (Exception e) {
            readableDatabase.execSQL("ALTER TABLE adult_sheet ADD COLUMN mibi1 INTEGER");
            readableDatabase.execSQL("ALTER TABLE adult_sheet ADD COLUMN mibi2 INTEGER");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN mibi1 INTEGER");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN mibi2 INTEGER");
            readableDatabase.execSQL("ALTER TABLE adult_sheet ADD COLUMN check_breath_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN check_breath_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle1_comp_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle1_breath_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle2_comp_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle2_breath_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle3_comp_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle3_breath_time REAL");
            i2 = 0;
            i3 = 0;
        }
        try {
            d = rawQuery.getDouble(22);
        } catch (Exception e2) {
            readableDatabase.execSQL("ALTER TABLE adult_sheet ADD COLUMN check_breath_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN check_breath_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle1_comp_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle1_breath_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle2_comp_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle2_breath_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle3_comp_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle3_breath_time REAL");
            d = 0.0d;
        }
        C2538f fVar = new C2538f(i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i2, i3, d);
        rawQuery.close();
        return fVar;
    }

    /* renamed from: u */
    public C2545m mo9616u(int i) {
        int i2;
        int i3;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        SQLiteDatabase readableDatabase = getReadableDatabase();
        Cursor rawQuery = readableDatabase.rawQuery("SELECT * FROM infant_sheet WHERE data_idx = ?;", new String[]{i + ""});
        if (rawQuery == null || rawQuery.getCount() <= 0) {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        }
        rawQuery.moveToFirst();
        int i4 = rawQuery.getInt(0);
        int i5 = rawQuery.getInt(1);
        int i6 = rawQuery.getInt(2);
        int i7 = rawQuery.getInt(3);
        int i8 = rawQuery.getInt(4);
        int i9 = rawQuery.getInt(5);
        int i10 = rawQuery.getInt(6);
        int i11 = rawQuery.getInt(7);
        int i12 = rawQuery.getInt(8);
        int i13 = rawQuery.getInt(9);
        int i14 = rawQuery.getInt(10);
        int i15 = rawQuery.getInt(11);
        int i16 = rawQuery.getInt(12);
        int i17 = rawQuery.getInt(13);
        try {
            i2 = rawQuery.getInt(14);
            i3 = rawQuery.getInt(15);
        } catch (Exception e) {
            readableDatabase.execSQL("ALTER TABLE adult_sheet ADD COLUMN mibi1 INTEGER");
            readableDatabase.execSQL("ALTER TABLE adult_sheet ADD COLUMN mibi2 INTEGER");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN mibi1 INTEGER");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN mibi2 INTEGER");
            readableDatabase.execSQL("ALTER TABLE adult_sheet ADD COLUMN check_breath_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN check_breath_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle1_comp_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle1_breath_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle2_comp_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle2_breath_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle3_comp_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle3_breath_time REAL");
            i2 = 0;
            i3 = 0;
        }
        try {
            d = rawQuery.getDouble(16);
            d2 = rawQuery.getDouble(17);
            d3 = rawQuery.getDouble(18);
            d4 = rawQuery.getDouble(19);
            d5 = rawQuery.getDouble(20);
            d6 = rawQuery.getDouble(21);
            d7 = rawQuery.getDouble(22);
        } catch (Exception e2) {
            readableDatabase.execSQL("ALTER TABLE adult_sheet ADD COLUMN check_breath_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN check_breath_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle1_comp_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle1_breath_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle2_comp_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle2_breath_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle3_comp_time REAL");
            readableDatabase.execSQL("ALTER TABLE infant_sheet ADD COLUMN cycle3_breath_time REAL");
            d = 0.0d;
            d2 = 0.0d;
            d3 = 0.0d;
            d4 = 0.0d;
            d5 = 0.0d;
            d6 = 0.0d;
            d7 = 0.0d;
        }
        C2545m mVar = new C2545m(i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i2, i3, d, d2, d3, d4, d5, d6, d7);
        rawQuery.close();
        return mVar;
    }

    /* renamed from: v */
    public void mo9617v(int i) {
        getReadableDatabase().execSQL("DELETE FROM action_event WHERE data_idx=?;", new String[]{i + ""});
    }

    /* renamed from: w */
    public ArrayList<C2537e> mo9618w(int i) {
        ArrayList<C2537e> arrayList = new ArrayList<>();
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM action_event WHERE data_idx = ?;", new String[]{i + ""});
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                do {
                    arrayList.add(new C2537e(rawQuery.getInt(0), rawQuery.getInt(1), rawQuery.getInt(2), rawQuery.getInt(3), rawQuery.getInt(4)));
                } while (rawQuery.moveToNext());
                rawQuery.close();
                return arrayList;
            } else if (rawQuery == null) {
                return null;
            } else {
                rawQuery.close();
                return null;
            }
        } else if (rawQuery == null) {
            return null;
        } else {
            rawQuery.close();
            return null;
        }
    }
}

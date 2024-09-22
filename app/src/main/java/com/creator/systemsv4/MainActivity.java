package com.creator.systemsv4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TextView;

import com.jakewharton.processphoenix.ProcessPhoenix;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private EditText MPH, MPA, GDH, GDA, PPH, PPA;
    private TextView progress_txt;
    private TextView n1_txt, a1_txt, a2_txt, h1a_txt, h1b_txt, b1_txt, b2_txt, non_abs_home_txt, non_abs_away_txt, h2a_txt, h2b_txt, c1_txt, c2_txt, abs_home_txt, abs_away_txt, h3a_txt, h3b_txt, d1_txt, d2_txt, d3_txt, n2_txt, r1a_txt, r1b_txt, g1_txt, g2_txt, r2a_txt, r2b_txt, r3a_txt, r3b_txt, l2_txt, l3_txt, l4_txt, l5_txt, l6_txt, l7_txt, m1_txt, m2_txt, m3_txt, m4_txt, m6_txt, m7_txt;
    private Button run, reset;
    private String init_res, res, ds_res;
    private TableLayout first_analysis_table;
    private TextView anal, anal2, ds_res_txt, ds_res_txt2, ds_res_txt3, final_anal_txt;
    private TextView X1_txt, X2_txt, Y1_txt, Y2_txt, Z1_txt, Z2_txt, t3_txt, t4_txt, t5_txt, t6_txt, u3_txt, u4_txt, u6_txt, u7_txt, v4_txt, v5_txt, v6_txt, vv4_txt, vv5_txt;
    private TextView Tx_txt, T2_txt, T1_txt, Blx_txt, Bly_txt, BL_txt, Vx_txt, V2_txt, V1_txt, Mlx_txt, Mly_txt, ML_txt, Nx_txt, N2_txt, N1_txt, BM1_txt, Mx_txt, M2_txt, M1_txt, BM2_txt, R1_txt, R2_txt, R1R2f_txt, N_txt, R_txt, Ny_txt, Rx_txt, Nd_txt, Ne_txt, Nn_txt, B_txt, nN_txt, mM_txt, ha_txt, hac_txt;
    private TextView W_txt, Z_txt, D_txt, C_txt, G_txt, V_txt, Gt_txt, Vt_txt;
    private TextView marker_txt, marker2_txt, marker3_txt, marker4_txt;
    private TextView GP_txt, XY_txt, oGP_txt, oXY_txt, XB_txt, YM_txt, NXB_txt, NYM_txt, GV_txt, GVT_txt, OX_txt, OY_txt;
    private TextView x1_txt, y1_txt, x2_txt, y2_txt, xx_txt, yy_txt, xn_txt, ym_txt, xx2_txt, yy2_txt;
    //private TextView DN_txt, SN_txt;
    private TextView Bd1_txt, Cd1_txt, Dd1_txt, Bd2_txt, Cd2_txt, Dd2_txt, Bd1r_txt, Cd1r_txt, Dd1r_txt, Bd2r_txt, Cd2r_txt, Dd2r_txt, V1N2_txt, V2N1_txt, VV_txt, NN_txt, M0_txt, N0_txt, MN0_txt;
    int A1;
    int A2;

    int sum1a;
    int sum11a;
    int sum2a;
    int sum22a;
    int sum3a;
    int sum33a;
    int sum1b;
    int sum11b;
    int sum2b;
    int sum22b;
    int sum3b;
    int sum33b;
    int suma1;
    int sumaa1;
    int suma2;
    int sumaa2;
    int sumg1;
    int sumgg1;
    int sumg2;
    int sumgg2;
    int sumh1a;
    int sumhh1a;
    int sumh1b;
    int sumhh1b;
    int sumh2a;
    int sumhh2a;
    int sumh2b;
    int sumhh2b;
    int sumh3a;
    int sumhh3a;
    int sumh3b;
    int sumhh3b;
    int sumH;
    int sumHH;
    int sumA;
    int sumAA;
    //
    int rr1a;
    int rr1b;
    int rr2a;
    int rr2b;
    int rr3a;
    int rr3b;
    int aa1;
    int aa2;
    int gg1;
    int gg2;
    int hh1a;
    int hh1b;
    int hh2a;
    int hh2b;
    int hh3a;
    int hh3b;
    int XX;
    int YY;

    int pointsH;
    int pointsA;
    int gdH;
    int gdA;

    int Tx;
    int T2;
    int T1;
    int Blx;
    int Bly;
    int BL;
    int Vx;
    int V2;
    int V1;
    int Mlx;
    int Mly;
    int ML;
    int Nx;
    int N2;
    int N1;
    int BM1;
    int Mx;
    int M2;
    int M1;
    int BM2;
    int R1;
    int R2;
    int R1R2f;
    int R1mR2f;
    int N2M2f;
    int N2mM2;
    int NxMx;
    int NxmMx;
    int NxmMxf;
    int NxMxf;
    int B;
    int nN;
    int mM;
    int W;
    int Z;
    int D;
    int C;
    int M0;
    int N0;
    int MN0;
    int GP;
    int XY;
    int NGP;
    int NXY;
    int XB;
    int YM;
    int NXB;
    int NYM;
    int G;
    int V;
    int Gt;
    int Vt;
    int GV;
    int GVT;
    int OX;
    int OY;
    int x1;
    int y1;
    int x2;
    int y2;
    int x1x2;
    int y1y2;
    int xn;
    int ym;

    int xx1, yy1, xd, yd, xd1, yd1, x3, y3;

    String ha;
    String xStart;
    String xStart2;
    String haXD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MPH = findViewById(R.id.MPH);
        GDH = findViewById(R.id.GDH);
        PPH = findViewById(R.id.PPH);
        MPA = findViewById(R.id.MPA);
        GDA = findViewById(R.id.GDA);
        PPA = findViewById(R.id.PPA);
        progress_txt = findViewById(R.id.progress_txt);
        n1_txt = findViewById(R.id.n1);
        a1_txt = findViewById(R.id.a1);
        a2_txt = findViewById(R.id.a2);
        h1a_txt = findViewById(R.id.h1a);
        h1b_txt = findViewById(R.id.h1b);
        b1_txt = findViewById(R.id.b1);
        b2_txt = findViewById(R.id.b2);
        non_abs_away_txt = findViewById(R.id.non_abs_away);
        non_abs_home_txt = findViewById(R.id.non_abs_home);
        h2a_txt = findViewById(R.id.h2a);
        h2b_txt = findViewById(R.id.h2b);
        c1_txt = findViewById(R.id.c1);
        c2_txt = findViewById(R.id.c2);
        abs_home_txt = findViewById(R.id.abs_home);
        abs_away_txt = findViewById(R.id.abs_away);
        h3a_txt = findViewById(R.id.h3a);
        h3b_txt = findViewById(R.id.h3b);
        d1_txt = findViewById(R.id.d1);
        d2_txt = findViewById(R.id.d2);
        d3_txt = findViewById(R.id.d3);
        n2_txt = findViewById(R.id.n2);
        r1a_txt = findViewById(R.id.r1a);
        r1b_txt = findViewById(R.id.r1b);
        g1_txt = findViewById(R.id.g1);
        g2_txt = findViewById(R.id.g2);
        r2a_txt = findViewById(R.id.r2a);
        r2b_txt = findViewById(R.id.r2b);
        r3a_txt = findViewById(R.id.r3a);
        r3b_txt = findViewById(R.id.r3b);
        l2_txt = findViewById(R.id.l2);
        l3_txt = findViewById(R.id.l3);
        l4_txt = findViewById(R.id.l4);
        l5_txt = findViewById(R.id.l5);
        l6_txt = findViewById(R.id.l6);
        l7_txt = findViewById(R.id.l7);
        m1_txt = findViewById(R.id.m1);
        m2_txt = findViewById(R.id.m2);
        m3_txt = findViewById(R.id.m3);
        m4_txt = findViewById(R.id.m4);
        m6_txt = findViewById(R.id.m6);
        m7_txt = findViewById(R.id.m7);
        X1_txt = findViewById(R.id.X1);
        X2_txt = findViewById(R.id.X2);
        Y1_txt = findViewById(R.id.Y1);
        Y2_txt = findViewById(R.id.Y2);
        Z1_txt = findViewById(R.id.Z1);
        Z2_txt = findViewById(R.id.Z2);
        t3_txt = findViewById(R.id.t3);
        t4_txt = findViewById(R.id.t4);
        t5_txt = findViewById(R.id.t5);
        t6_txt = findViewById(R.id.t6);
        u7_txt = findViewById(R.id.u7);
        u3_txt = findViewById(R.id.u3);
        u4_txt = findViewById(R.id.u4);
        u6_txt = findViewById(R.id.u6);
        v4_txt = findViewById(R.id.v4);
        v5_txt = findViewById(R.id.v5);
        v6_txt = findViewById(R.id.v6);
        vv4_txt = findViewById(R.id.vv4);
        vv5_txt = findViewById(R.id.vv5);
        Tx_txt = findViewById(R.id.Tx);
        T2_txt = findViewById(R.id.T2);
        T1_txt = findViewById(R.id.T1);
        Blx_txt = findViewById(R.id.Blx);
        Bly_txt = findViewById(R.id.Bly);
        BL_txt = findViewById(R.id.BL);
        Vx_txt = findViewById(R.id.Vx);
        V2_txt = findViewById(R.id.V2);
        V1_txt = findViewById(R.id.V1);
        Nx_txt = findViewById(R.id.Nx);
        N2_txt = findViewById(R.id.N2);
        N1_txt = findViewById(R.id.N1);
        BM1_txt = findViewById(R.id.BM1);
        BM2_txt = findViewById(R.id.BM2);
        Mx_txt = findViewById(R.id.Mx);
        M2_txt = findViewById(R.id.M2);
        M1_txt = findViewById(R.id.M1);
        Mlx_txt = findViewById(R.id.Mlx);
        Mly_txt = findViewById(R.id.Mly);
        ML_txt = findViewById(R.id.ML);
        R1_txt = findViewById(R.id.R1);
        R2_txt = findViewById(R.id.R2);
        R1R2f_txt = findViewById(R.id.R1R2f);
        N_txt = findViewById(R.id.N);
        Ny_txt = findViewById(R.id.Ny);
        Nd_txt = findViewById(R.id.Nd);
        Ne_txt = findViewById(R.id.Ne);
        R_txt = findViewById(R.id.R);
        Rx_txt = findViewById(R.id.Rx);
        Nn_txt = findViewById(R.id.Nn);
        B_txt = findViewById(R.id.B);
        nN_txt = findViewById(R.id.nN);
        mM_txt = findViewById(R.id.mM);
        W_txt = findViewById(R.id.W);
        Z_txt = findViewById(R.id.Z);
        C_txt = findViewById(R.id.C);
        D_txt = findViewById(R.id.D);
        G_txt = findViewById(R.id.G);
        V_txt = findViewById(R.id.V);
        Gt_txt = findViewById(R.id.Gt);
        Vt_txt = findViewById(R.id.Vt);
        Bd1_txt = findViewById(R.id.Bd1);
        Bd2_txt = findViewById(R.id.Bd2);
        Cd1_txt = findViewById(R.id.Cd1);
        Cd2_txt = findViewById(R.id.Cd2);
        Dd1_txt = findViewById(R.id.Dd1);
        Dd2_txt = findViewById(R.id.Dd2);
        Bd1r_txt = findViewById(R.id.Bd1r);
        Bd2r_txt = findViewById(R.id.Bd2r);
        Cd1r_txt = findViewById(R.id.Cd1r);
        Cd2r_txt = findViewById(R.id.Cd2r);
        Dd1r_txt = findViewById(R.id.Dd1r);
        Dd2r_txt = findViewById(R.id.Dd2r);
        marker_txt = findViewById(R.id.marker);
        marker2_txt = findViewById(R.id.markerII);
        marker3_txt = findViewById(R.id.markerIII);
        marker4_txt = findViewById(R.id.markerIV);
        //DN_txt = findViewById(R.id.DN);
        //SN_txt = findViewById(R.id.SN);
        V1N2_txt = findViewById(R.id.V1N2);
        V2N1_txt = findViewById(R.id.V2N1);
        VV_txt = findViewById(R.id.VV);
        NN_txt = findViewById(R.id.NN);
        M0_txt = findViewById(R.id.M0);
        N0_txt = findViewById(R.id.N0);
        MN0_txt = findViewById(R.id.MN0);
        anal = findViewById(R.id.analysis);
        anal2 = findViewById(R.id.analysis2);
        final_anal_txt = findViewById(R.id.final_anal);
        ha_txt = findViewById(R.id.ha);
        hac_txt = findViewById(R.id.hac);
        GP_txt = findViewById(R.id.GP);
        XY_txt = findViewById(R.id.XY);
        oGP_txt = findViewById(R.id.oGP);
        oXY_txt = findViewById(R.id.oXY);
        XB_txt = findViewById(R.id.XB);
        YM_txt = findViewById(R.id.YM);
        NXB_txt = findViewById(R.id.NXB);
        NYM_txt = findViewById(R.id.NYM);
        GV_txt = findViewById(R.id.GV);
        GVT_txt = findViewById(R.id.GVT);
        OX_txt = findViewById(R.id.OX);
        OY_txt = findViewById(R.id.OY);
        x1_txt = findViewById(R.id.x1);
        y1_txt = findViewById(R.id.y1);
        x2_txt = findViewById(R.id.x2);
        y2_txt = findViewById(R.id.y2);
        xx_txt = findViewById(R.id.xx);
        yy_txt = findViewById(R.id.yy);
        xx2_txt = findViewById(R.id.xx2);
        yy2_txt = findViewById(R.id.yy2);
        xn_txt = findViewById(R.id.xn);
        ym_txt = findViewById(R.id.ym);
        ds_res_txt = findViewById(R.id.draw_scrore_analysis);
        ds_res_txt2 = findViewById(R.id.draw_scrore_analysis2);
        ds_res_txt3 = findViewById(R.id.draw_scrore_analysis3);
        first_analysis_table = findViewById(R.id.first_analysis_table);

        run = findViewById(R.id.run_btn);
        reset = findViewById(R.id.reset_btn);
        reset.setOnClickListener(v-> {
            ProcessPhoenix.triggerRebirth(this);
        });

        run.setOnClickListener(v-> {
            reset.setVisibility(View.VISIBLE);
            reset.setClickable(true);
            reset.setClickable(true);
            hideKeyboard(this);
            progress_txt.setVisibility(View.VISIBLE);
            progress_txt.setText("Running Analysis");

            int a1 = Integer.parseInt(PPA.getText().toString()) - Integer.parseInt(MPH.getText().toString()) + Integer.parseInt(GDH.getText().toString());
            int a2 = Integer.parseInt(PPH.getText().toString()) - Integer.parseInt(MPA.getText().toString()) + Integer.parseInt(GDA.getText().toString());
            A1 = a1;
            A2 = a2;
            int b1 = a1 - a2;
            int b2 = 0;
            int c1 = -a1 + b1;
            int c2 = a1;
            int d1 = Math.abs(a2) - Math.abs(b1);
            int d2 = Math.abs(a1) - Math.abs(b1);
            int d3 = d1 + d2;
            int n1 = a1 + Integer.parseInt(GDA.getText().toString());
            int n2 = d3 + Integer.parseInt(GDH.getText().toString());
            int non_abs_home = Math.abs(n2) - Math.abs(n1);
            int non_abs_away = Math.abs(d3) - Math.abs(a1);
            int abs_home = Math.abs(non_abs_home);
            int abs_away = Math.abs(non_abs_away);
            int h1a = abs_home + Integer.parseInt(GDA.getText().toString());
            int h1b = abs_away + Integer.parseInt(GDH.getText().toString());
            int h2a = abs_away + Integer.parseInt(GDA.getText().toString());
            int h2b = abs_home + Integer.parseInt(GDH.getText().toString());
            int h3a = h1b + h2a;
            int h3b = h1a + h2b;
            int g1 = h1a + h2a;
            int g2 = h1b + h2b;
            int r1a = a1;
            int r1b = a2;
            int r2a = h3a + d1;
            int r2b = h3b + d2;
            int r3a = r1b - r2a;
            int r3b = r1a - r2b;
            int D1 = (h1a + h2a + Integer.parseInt(GDH.getText().toString())) - (abs_home + abs_away);
            int D2 = -h1b + h2b + Integer.parseInt(GDA.getText().toString());
            int X = abs_home;
            int Y = abs_away;
            int DH = D1 + X;
            int DA = D2 + Y;
            int XH;
            int XA;
            XH = (D2 + X) + (Y - Y);
            XA = (D1 + X) + (Y - X);
            int i1 = DH + XH;
            int i2 = DA + XA;
            int i3 = DH + XH;
            int i4 = DA + XA;
            int i5 = (i1 - i2) + (h3a - h3b);
            int i6 = (i1 - i2) + (h3a + h3b);
            int j1 = Y + i3;
            int j2 = X + i4;
            int j3 = Y + i3;
            int j4 = X + i4;
            int j5 = (XH - DA) - (DH - XA) + (h3a + h3b);
            int j6 = (XH - DA) - (DH - XA) + (h3a - h3b);
            int j7 = i6 + i5 + j5 + j6;
            int k1 = i4 + j3;
            int k2 = i3 + j4;
            int k3 = XH + k1;
            int k4 = XA + k2;
            int k5 = k3 - k4;
            int k6 = XH - XA;
            //
            int l2;
            int l3;
            int l4;
            int l5;
            int l6;
            String l7;
            int m1;
            int m2;
            int m3;
            int m4;
            int m6;
            String m7;

            m1 = h2a + (h1a - h1b);

            l2 = h1b + (h1a - h1b);
            m2 = h2b;

            if(g1 > g2) { l3 = m1 - m2; } else { l3 = m1 + m2; }
            m3 = m1 - m2;

            if(g1 > g2) { l4 = m1 - l2; } else { l4 = m1 + l2; }

            l5 = X - Y;

            int[] Arr1 = { m1, l2, l4, l5 };
            int product1 = 1;
            for(int i=0; i<Arr1.length; i++){
                if(Arr1[i] == 0) {
                    Arr1[i] = 1;
                }
                product1 = product1 * Arr1[i];
            }

            if(product1 < 0) { m4 = l5 + l4; } else { m4 = l5 - l4; }

            if(product1 < 0 ) { l6 = l4 - l5; } else { l6 = l4 + l5; }

            int[] Arr2 = { m3, m4 };
            int product2 = 1;
            for(int i=0; i<Arr2.length; i++){
                if(Arr2[i] == 0) {
                    Arr2[i] = 1;
                }
                product2 = product2 * Arr2[i];
            }

            if(m4 < 0) { m6 = m3 + m4; } else { m6 = m3 - m4; }

            int t3;
            int t4;
            int t5;
            int t6;
            String u7;
            int u3;
            int u4;
            int u6;

            if(g1 > g2) { t3 = h2a - h2b; } else { t3 = h2a + h2b; }

            if(a1 > a2) { u3 = h2a - h2b; } else { u3 = h2a + h2b; }

            if(g1 > g2) { t4 = h2a - h1a; } else { t4 = h2a + h1a; }

            t5 = X - Y;

            int[] Arrt = { h2a, h1a, t4, t5};
            int productt = 1;
            for(int i=0; i<Arrt.length; i++){
                if(Arrt[i] == 0) {
                    Arrt[i] = 1;
                }
                productt = productt * Arrt[i];
            }

            if(productt < 0) { t6 = t4 - t5; } else { t6 = t4 + t5; }

            int[] Arru = { h2a, h1a, t4, t5 };
            int productu = 1;
            for(int i=0; i<Arru.length; i++){
                if(Arru[i] == 0) {
                    Arru[i] = 1;
                }
                productu = productu * Arru[i];
            }

            if(productu < 0) { u4 = t4 + t5; } else { u4 = t4 - t5; }

            u6 = u3 + u4;

            int v4;
            int v5;
            int v6;

            v4 = h2a - h1a;
            //if( (h2a * h1a) * (h2a - h1b) < 0 ) { v5 = X - Y; } else { v5 = X + Y; }

            if(t5 * -1 <= 0 ) {
                v5 = X + Y;
            } else {
                v5 = X - Y;
            }

            if( (h2a * h1a) * (h2a - h1b) < 0 ) { v6 = v4 - v5; } else { v6 = v4 + v5; }

            int v4_ld = lastDigit(v4);
            int v5_ld = lastDigit(v5);
            int v6_ld = lastDigit(v6);

            int t3_ld = lastDigit(t3);
            int t4_ld = lastDigit(t4);
            int t5_ld = lastDigit(t5);
            int t6_ld = lastDigit(t6);
            int u3_ld = lastDigit(u3);
            int u4_ld = lastDigit(u4);
            int u6_ld = lastDigit(u6);

            int l2_ld = lastDigit(l2);
            int l4_ld = lastDigit(l4);
            int l3_ld = lastDigit(l3);
            int l5_ld = lastDigit(l5);
            int l6_ld = lastDigit(l6);
            int m1_ld = lastDigit(m1);
            int m3_ld = lastDigit(m3);
            int m6_ld = lastDigit(m6);
            int h2a_ld = lastDigit(h2a);
            int h2b_ld = lastDigit(h2b);
            int h3a_ld = lastDigit(h3a);
            int h3b_ld = lastDigit(h3b);
            int r2a_ld = lastDigit(r2a);
            int r2b_ld = lastDigit(r2b);
            int m2_ld = lastDigit(m2);
            int m4_ld = lastDigit(m4);
            int a1_ld = lastDigit(a1);
            int a2_ld = lastDigit(a2);

            int r3a_ld = lastDigit(r3a);

            int r1a_ld = lastDigit(r1a);
            int r1b_ld = lastDigit(r1b);
            int r3b_ld = lastDigit(r3b);
            int h1a_ld = lastDigit(h1a);
            int h1b_ld = lastDigit(h1b);

            String signg1 = checkPosNeg(g1);
            String signg2 = checkPosNeg(g2);


            int H_ld = lastDigit(X);

            String signL2 = checkPosNeg(l2);
            String signM1 = checkPosNeg(m1);
            String signL3 = checkPosNeg(l3);
            String signL4 = checkPosNeg(l4);
            String signL5 = checkPosNeg(l5);
            String signV4 = checkPosNeg(v4);
            String signV5 = checkPosNeg(v5);
            String signR1b = checkPosNeg(r1b);
            String signR3b = checkPosNeg(r3b);

            String signh2a = checkPosNeg(h2a);
            String signh2b = checkPosNeg(h2b);

            String signM3 = checkPosNeg(m3);
            String signM4 = checkPosNeg(m4);
            String signM2 = checkPosNeg(m2);
            String signM6 = checkPosNeg(m6);
            String signL6 = checkPosNeg(l6);
            String signH1a = checkPosNeg(h1a);
            String signH1b = checkPosNeg(h1b);
            String signH2a = checkPosNeg(h2a);
            String signH2b = checkPosNeg(h2b);
            String signR2a = checkPosNeg(r2a);
            String signR2b = checkPosNeg(r2b);
            String signH3a = checkPosNeg(h3a);
            String signH3b = checkPosNeg(h3b);
            String signX = checkPosNeg(X);
            String signY = checkPosNeg(Y);

            int A_ld = lastDigit(Y);

            XX =  Math.abs(X);
            if ((XX > 9 & XX< 1000) | (XX < -9 & XX > -1000)) {
                sumH = 0;
                while (XX > 0) {
                    sumH = sumH + XX % 10;
                    XX = XX / 10;
                }
            } else {
                sumH = XX;
            }
            if(sumH > 9) {
                while (sumH > 0) {
                    sumHH = sumHH + sumH % 10;
                    sumH = sumH / 10;
                }
            } else {
                sumHH = sumH;
            }
            if(signX.equals("Negative")) {
                sumHH = sumHH * -1;
            }

            YY =  Math.abs(Y);
            if ((YY > 9 & YY < 1000) | (YY < -9 & YY > -1000)) {
                sumA = 0;
                while (YY > 0) {
                    sumA = sumA + YY % 10;
                    YY = YY / 10;
                }
            } else {
                sumA = YY;
            }
            if(sumA > 9) {
                while (sumA > 0) {
                    sumAA = sumAA + sumA % 10;
                    sumA = sumA / 10;
                }
            } else {
                sumAA = sumA;
            }
            if(signY.equals("Negative")) {
                sumAA = sumAA * -1;
            }

            // Run reduced for Analysis
            String signr1a = checkPosNeg(r1a);
            rr1a = Math.abs(r1a);
            if ((rr1a > 9 & rr1a < 1000) | (rr1a < -9 & rr1a > -1000)) {
                sum1a = 0;
                while (rr1a > 0) {
                    sum1a = sum1a + rr1a % 10;
                    rr1a = rr1a / 10;
                }
            } else {
                sum1a = rr1a;
            }
            if(sum1a > 9) {
                while (sum1a > 0) {
                    sum11a = sum11a + sum1a % 10;
                    sum1a = sum1a / 10;
                }
            } else {
                sum11a = sum1a;
            }
            if(signr1a.equals("Negative")) {
                sum11a = sum11a * -1;
            }
            String signr2a = checkPosNeg(r2a);
            rr2a =  Math.abs(r2a);
            if ((rr2a > 9 & rr2a < 1000) | (rr2a < -9 & rr2a > -1000)) {
                sum2a = 0;
                while (rr2a > 0) {
                    sum2a = sum2a + rr2a % 10;
                    rr2a = rr2a / 10;
                }
            } else {
                sum2a = rr2a;
            }
            if(sum2a > 9) {
                while (sum2a > 0) {
                    sum22a = sum22a + sum2a % 10;
                    sum2a = sum2a / 10;
                }
            } else {
                sum22a = sum2a;
            }
            if(signr2a.equals("Negative")) {
                sum22a = sum22a * -1;
            }
            String signr3a = checkPosNeg(r3a);
            rr3a =  Math.abs(r3a);
            if ((rr3a > 9 & rr3a < 1000) | (rr3a < -9 & rr3a > -1000)) {
                sum3a = 0;
                while (rr3a > 0) {
                    sum3a = sum3a + rr3a % 10;
                    rr3a = rr3a / 10;
                }
            } else {
                sum3a = rr3a;
            }
            if(sum3a > 9) {
                while (sum3a > 0) {
                    sum33a = sum33a + sum3a % 10;
                    sum3a = sum3a / 10;
                }
            } else {
                sum33a = sum3a;
            }
            if(signr3a.equals("Negative")) {
                sum33a = sum33a * -1;
            }
            String signr1b = checkPosNeg(r1b);
            rr1b =  Math.abs(r1b);
            if ((rr1b > 9 & rr1b < 1000) | (rr1b < -9 & rr1b > -1000)) {
                sum1b = 0;
                while (rr1b > 0) {
                    sum1b = sum1b + rr1b % 10;
                    rr1b = rr1b / 10;
                }
            } else {
                sum1b = rr1b;
            }
            if(sum1b > 9) {
                while (sum1b > 0) {
                    sum11b = sum11b + sum1b % 10;
                    sum1b = sum1b / 10;
                }
            } else {
                sum11b = sum1b;
            }
            if(signr1b.equals("Negative")) {
                sum11b = sum11b * -1;
            }
            String signr2b = checkPosNeg(r2b);
            rr2b =  Math.abs(r2b);
            if ((rr2b > 9 & rr2b < 1000) | (rr2b < -9 & rr2b > -1000)) {
                sum2b = 0;
                while (rr2b > 0) {
                    sum2b = sum2b + rr2b % 10;
                    rr2b = rr2b / 10;
                }
            } else {
                sum2b = rr2b;
            }
            if(sum2b > 9) {
                while (sum2b > 0) {
                    sum22b = sum22b + sum2b % 10;
                    sum2b = sum2b / 10;
                }
            } else {
                sum22b = sum2b;
            }
            if(signr2b.equals("Negative")) {
                sum22b = sum22b * -1;
            }
            String signr3b = checkPosNeg(r3b);
            rr3b =  Math.abs(r3b);
            if ((rr3b > 9 & rr3b < 1000) | (rr3b < -9 & rr3b > -1000)) {
                sum3b = 0;
                while (rr3b > 0) {
                    sum3b = sum3b + rr3b % 10;
                    rr3b = rr3b / 10;
                }
            } else {
                sum3b = rr3b;
            }
            if(sum3b > 9) {
                while (sum3b > 0) {
                    sum33b = sum33b + sum3b % 10;
                    sum3b = sum3b / 10;
                }
            } else {
                sum33b = sum3b;
            }
            if(signr3b.equals("Negative")) {
                sum33b = sum33b * -1;
            }

            String signa1 = checkPosNeg(a1);
            aa1 =  Math.abs(a1);
            if ((aa1 > 9 & aa1 < 1000) | (aa1 < -9 & aa1 > -1000)) {
                suma1 = 0;
                while (aa1 > 0) {
                    suma1 = suma1 + aa1 % 10;
                    aa1 = aa1 / 10;
                }
            } else {
                suma1 = aa1;
            }
            if(suma1 > 9) {
                while (suma1 > 0) {
                    sumaa1 = sumaa1 + suma1 % 10;
                    suma1 = suma1 / 10;
                }
            } else {
                sumaa1 = suma1;
            }
            if(signa1.equals("Negative")) {
                sumaa1 = sumaa1 * -1;
            }
            String signa2 = checkPosNeg(a2);
            aa2 =  Math.abs(a2);
            if ((aa2 > 9 & aa2 < 1000) | (aa2 < -9 & aa2 > -1000)) {
                suma2 = 0;
                while (aa2 > 0) {
                    suma2 = suma2 + aa2 % 10;
                    aa2 = aa2 / 10;
                }
            } else {
                suma2 = aa2;
            }
            if(suma2 > 9) {
                while (suma2 > 0) {
                    sumaa2 = sumaa2 + suma2 % 10;
                    suma2 = suma2 / 10;
                }
            } else {
                sumaa2 = suma2;
            }
            if(signa2.equals("Negative")) {
                sumaa2 = sumaa2 * -1;
            }

            gg1 =  Math.abs(g1);
            if ((gg1 > 9 & gg1 < 1000) | (gg1 < -9 & gg1 > -1000)) {
                sumg1 = 0;
                while (gg1 > 0) {
                    sumg1 = sumg1 + gg1 % 10;
                    gg1 = gg1 / 10;
                }
            } else {
                sumg1 = gg1;
            }
            if(sumg1 > 9) {
                while (sumg1 > 0) {
                    sumgg1 = sumgg1 + sumg1 % 10;
                    sumg1 = sumg1 / 10;
                }
            } else {
                sumgg1 = sumg1;
            }
            if(signg1.equals("Negative")) {
                sumgg1 = sumgg1 * -1;
            }

            gg2 =  Math.abs(g2);
            if ((gg2 > 9 & gg2 < 1000) | (gg2 < -9 & gg2 > -1000)) {
                sumg2 = 0;
                while (gg2 > 0) {
                    sumg2 = sumg2 + gg2 % 10;
                    gg2 = gg2 / 10;
                }
            } else {
                sumg2 = gg2;
            }
            if(sumg2 > 9) {
                while (sumg2 > 0) {
                    sumgg2 = sumgg2 + sumg2 % 10;
                    sumg2 = sumg2 / 10;
                }
            } else {
                sumgg2 = sumg2;
            }
            if(signg2.equals("Negative")) {
                sumgg2 = sumgg2 * -1;
            }
            String signh1a = checkPosNeg(h1a);
            hh1a =  Math.abs(h1a);
            if ((hh1a > 9 & hh1a < 1000) | (hh1a < -9 & hh1a > -1000)) {
                sumh1a = 0;
                while (hh1a > 0) {
                    sumh1a = sumh1a + hh1a % 10;
                    hh1a = hh1a / 10;
                }
            } else {
                sumh1a = hh1a;
            }
            if(sumh1a > 9) {
                while (sumh1a > 0) {
                    sumhh1a = sumhh1a + sumh1a % 10;
                    sumh1a = sumh1a / 10;
                }
            } else {
                sumhh1a = sumh1a;
            }
            if(signh1a.equals("Negative")) {
                sumhh1a = sumhh1a * -1;
            }
            String signh1b = checkPosNeg(h1b);
            hh1b =  Math.abs(h1b);
            if ((hh1b > 9 & hh1b < 1000) | (hh1b < -9 & hh1b > -1000)) {
                sumh1b = 0;
                while (hh1b > 0) {
                    sumh1b = sumh1b + hh1b % 10;
                    hh1b = hh1b / 10;
                }
            } else {
                sumh1b = hh1b;
            }
            if(sumh1b > 9) {
                while (sumh1b > 0) {
                    sumhh1b = sumhh1b + sumh1b % 10;
                    sumh1b = sumh1b / 10;
                }
            } else {
                sumhh1b = sumh1b;
            }
            if(signh1b.equals("Negative")) {
                sumhh1b = sumhh1b * -1;
            }

            hh2a =  Math.abs(h2a);
            if ((hh2a > 9 & hh2a < 1000) | (hh2a < -9 & hh2a > -1000)) {
                sumh2a = 0;
                while (hh2a > 0) {
                    sumh2a = sumh2a + hh2a % 10;
                    hh2a = hh2a / 10;
                }
            } else {
                sumh2a = hh2a;
            }
            if(sumh2a > 9) {
                while (sumh2a > 0) {
                    sumhh2a = sumhh2a + sumh2a % 10;
                    sumh2a = sumh2a / 10;
                }
            } else {
                sumhh2a = sumh2a;
            }
            if(signh2a.equals("Negative")) {
                sumhh2a = sumhh2a * -1;
            }

            hh2b =  Math.abs(h2b);
            if ((hh2b > 9 & hh2b < 1000) | (hh2b < -9 & hh2b > -1000)) {
                sumh2b = 0;
                while (hh2b > 0) {
                    sumh2b = sumh2b + hh2b % 10;
                    hh2b = hh2b / 10;
                }
            } else {
                sumh2b = hh2b;
            }
            if(sumh2b > 9) {
                while (sumh2b > 0) {
                    sumhh2b = sumhh2b + sumh2b % 10;
                    sumh2b = sumh2b / 10;
                }
            } else {
                sumhh2b = sumh2b;
            }
            if(signh2b.equals("Negative")) {
                sumhh2b = sumhh2b * -1;
            }
            String signh3a = checkPosNeg(h3a);
            hh3a =  Math.abs(h3a);
            if ((hh3a > 9 & hh3a < 1000) | (hh3a < -9 & hh3a > -1000)) {
                sumh3a = 0;
                while (hh3a > 0) {
                    sumh3a = sumh3a + hh3a % 10;
                    hh3a = hh3a / 10;
                }
            } else {
                sumh3a = hh3a;
            }
            if(sumh3a > 9) {
                while (sumh3a > 0) {
                    sumhh3a = sumhh3a + sumh3a % 10;
                    sumh3a = sumh3a / 10;
                }
            } else {
                sumhh3a = sumh3a;
            }
            if(signh3a.equals("Negative")) {
                sumhh3a = sumhh3a * -1;
            }

            String signh3b = checkPosNeg(h3b);
            hh3b =  Math.abs(h3b);
            if ((hh3b > 9 & hh3b < 1000) | (hh3b < -9 & hh3b > -1000)) {
                sumh3b = 0;
                while (hh3b > 0) {
                    sumh3b = sumh3b + hh3b % 10;
                    hh3b = hh3b / 10;
                }
            } else {
                sumh3b = hh3b;
            }
            if(sumh3b > 9) {
                while (sumh3b > 0) {
                    sumhh3b = sumhh3b + sumh3b % 10;
                    sumh3b = sumh3b / 10;
                }
            } else {
                sumhh3b = sumh3b;
            }
            if(signh3b.equals("Negative")) {
                sumhh3b = sumhh3b * -1;
            }

            int ll2 =  Math.abs(l2);
            int suml2;
            int sumll2 = 0;
            if ((ll2 > 9 & ll2 < 1000) | (ll2 < -9 & ll2 > -1000)) {
                suml2 = 0;
                while (ll2 > 0) {
                    suml2 = suml2 + ll2 % 10;
                    ll2 = ll2 / 10;
                }
            } else {
                suml2 = ll2;
            }
            if(suml2 > 9) {
                while (suml2 > 0) {
                    sumll2 = sumll2 + suml2 % 10;
                    suml2 = suml2 / 10;
                }
            } else {
                sumll2 = suml2;
            }
            if(signL2.equals("Negative")) {
                sumll2 = sumll2 * -1;
            }

            int ll4 =  Math.abs(l4);
            int suml4;
            int sumll4 = 0;
            if ((ll4 > 9 & ll4 < 1000) | (ll4 < -9 & ll4 > -1000)) {
                suml4 = 0;
                while (ll4 > 0) {
                    suml4 = suml4 + ll4 % 10;
                    ll4 = ll4 / 10;
                }
            } else {
                suml4 = ll4;
            }
            if(suml4 > 9) {
                while (suml4 > 0) {
                    sumll4 = sumll4 + suml4 % 10;
                    suml4 = suml4 / 10;
                }
            } else {
                sumll4 = suml4;
            }
            if(signL4.equals("Negative")) {
                sumll4 = sumll4 * -1;
            }

            int ll5 =  Math.abs(l5);
            int suml5;
            int sumll5 = 0;
            if ((ll5 > 9 & ll5 < 1000) | (ll5 < -9 & ll5 > -1000)) {
                suml5 = 0;
                while (ll5 > 0) {
                    suml5 = suml5 + ll5 % 10;
                    ll5 = ll5 / 10;
                }
            } else {
                suml5 = ll5;
            }
            if(suml5 > 9) {
                while (suml5 > 0) {
                    sumll5 = sumll5 + suml5 % 10;
                    suml5 = suml5 / 10;
                }
            } else {
                sumll5 = suml5;
            }
            if(signL5.equals("Negative")) {
                sumll5 = sumll5 * -1;
            }

            int vvv4 =  Math.abs(v4);
            int sumv4;
            int sumvv4 = 0;
            if ((vvv4 > 9 & vvv4 < 1000) | (vvv4 < -9 & vvv4 > -1000)) {
                sumv4 = 0;
                while (vvv4 > 0) {
                    sumv4 = sumv4 + vvv4 % 10;
                    vvv4 = vvv4 / 10;
                }
            } else {
                sumv4 = vvv4;
            }
            if(sumv4 > 9) {
                while (sumv4 > 0) {
                    sumvv4 = sumvv4 + sumv4 % 10;
                    sumv4 = sumv4 / 10;
                }
            } else {
                sumvv4 = sumv4;
            }
            if(signV4.equals("Negative")) {
                sumvv4 = sumvv4 * -1;
            }

            int vvv5 =  Math.abs(v5);
            int sumv5;
            int sumvv5 = 0;
            if ((vvv5 > 9 & vvv5 < 1000) | (vvv5 < -9 & vvv5 > -1000)) {
                sumv5 = 0;
                while (vvv5 > 0) {
                    sumv5 = sumv5 + vvv5 % 10;
                    vvv5 = vvv5 / 10;
                }
            } else {
                sumv5 = vvv5;
            }
            if(sumv5 > 9) {
                while (sumv5 > 0) {
                    sumvv5 = sumvv5 + sumv5 % 10;
                    sumv5 = sumv5 / 10;
                }
            } else {
                sumvv5 = sumv5;
            }
            if(signV5.equals("Negative")) {
                sumvv5 = sumvv5 * -1;
            }

            int mm1 =  Math.abs(m1);
            int summ1;
            int summm1 = 0;
            if ((mm1 > 9 & mm1 < 1000) | (mm1 < -9 & mm1 > -1000)) {
                summ1 = 0;
                while (mm1 > 0) {
                    summ1 = summ1 + mm1 % 10;
                    mm1 = mm1 / 10;
                }
            } else {
                summ1 = mm1;
            }
            if(summ1 > 9) {
                while (summ1 > 0) {
                    summm1 = summm1 + summ1 % 10;
                    summ1 = summ1 / 10;
                }
            } else {
                summm1 = summ1;
            }
            if(signM1.equals("Negative")) {
                summm1 = summm1 * -1;
            }


            int mm2 =  Math.abs(m2);
            int summ2;
            int summm2 = 0;
            if ((mm2 > 9 & mm2 < 1000) | (mm2 < -9 & mm2 > -1000)) {
                summ2 = 0;
                while (mm2 > 0) {
                    summ2 = summ2 + mm2 % 10;
                    mm2 = mm2 / 10;
                }
            } else {
                summ2 = mm2;
            }
            if(summ2 > 9) {
                while (summ2 > 0) {
                    summm2 = summm2 + summ2 % 10;
                    summ2 = summ2 / 10;
                }
            } else {
                summm2 = summ2;
            }
            if(signM2.equals("Negative")) {
                summm2 = summm2 * -1;
            }

            int mm4 =  Math.abs(m4);
            int summ4;
            int summm4 = 0;
            if ((mm4 > 9 & mm4 < 1000) | (mm4 < -9 & mm4 > -1000)) {
                summ4 = 0;
                while (mm4 > 0) {
                    summ4 = summ4 + mm4 % 10;
                    mm4 = mm4 / 10;
                }
            } else {
                summ4 = mm4;
            }
            if(summ4 > 9) {
                while (summ4 > 0) {
                    summm4 = summm4 + summ4 % 10;
                    summ4 = summ4 / 10;
                }
            } else {
                summm4 = summ4;
            }
            if(signM4.equals("Negative")) {
                summm4 = summm4 * -1;
            }


            int g1_ld = lastDigit(g1);
            int g2_ld = lastDigit(g2);

            pointsH = Integer.parseInt(PPH.getText().toString());
            pointsA = Integer.parseInt(PPA.getText().toString());
            gdH = Integer.parseInt(GDH.getText().toString());
            gdA = Integer.parseInt(GDA.getText().toString());
            int mpH = Integer.parseInt(MPH.getText().toString());
            int mpA = Integer.parseInt(MPA.getText().toString());

            int gdDiffi = gdH - gdA;
            int sDiffi = X - Y;
            int aDiffi = a1 - a2;
            int pDiffi = pointsH - pointsA;

            int sD_ld = lastDigit(sDiffi);
            int gD_ld = lastDigit(gdDiffi);
            int aD_ld = lastDigit(aDiffi);
            int pD_ld = lastDigit(pDiffi);

            String signGDiffi = checkPosNeg(gdDiffi);
            String signsDiffi = checkPosNeg(sDiffi);
            String signpDiffi = checkPosNeg(pDiffi);
            String signaDiffi = checkPosNeg(aDiffi);

            int xx = gdDiffi + sDiffi;
            int yy = pDiffi + aDiffi;

            int xyPlus = xx + yy;
            int xyMinus = xx - yy;

            String signxxx = checkPosNeg(xx);
            String signyyy = checkPosNeg(yy);

            String signgdH = checkPosNeg(gdH);
            String signgdA = checkPosNeg(gdA);

            String signxyPlus2 = checkPosNeg(xyPlus);

            int xxyyPlus =  Math.abs(xyPlus);
            int sumxxyyPlus;
            int sumxxxyyyPlus = 0;
            if ((xxyyPlus > 9 & xxyyPlus < 1000) | (xxyyPlus < -9 & xxyyPlus > -1000)) {
                sumxxyyPlus = 0;
                while (xxyyPlus > 0) {
                    sumxxyyPlus = sumxxyyPlus + xxyyPlus % 10;
                    xxyyPlus = xxyyPlus / 10;
                }
            } else {
                sumxxyyPlus = xxyyPlus;
            }
            if(sumxxyyPlus > 9) {
                while (sumxxyyPlus > 0) {
                    sumxxxyyyPlus = sumxxxyyyPlus + sumxxyyPlus % 10;
                    sumxxyyPlus = sumxxyyPlus / 10;
                }
            } else {
                sumxxxyyyPlus = sumxxyyPlus;
            }
            if(signxyPlus2.equals("Negative")) {
                sumxxxyyyPlus = sumxxxyyyPlus * -1;
            }

            int ppd =  Math.abs(pDiffi);
            int sumppd;
            int sumppdd = 0;
            if ((ppd > 9 & ppd < 1000) | (ppd < -9 & ppd > -1000)) {
                sumppd = 0;
                while (ppd > 0) {
                    sumppd = sumppd + ppd % 10;
                    ppd = ppd / 10;
                }
            } else {
                sumppd = ppd;
            }
            if(sumppd > 9) {
                while (sumppd > 0) {
                    sumppdd = sumppdd + sumppd % 10;
                    sumppd = sumppd / 10;
                }
            } else {
                sumppdd = sumppd;
            }
            if(signpDiffi.equals("Negative")) {
                sumppdd = sumppdd * -1;
            }


            int yyy =  Math.abs(yy);
            int sumyyy;
            int sumyyyy = 0;
            if ((yyy > 9 & yyy < 1000) | (yyy < -9 & yyy > -1000)) {
                sumyyy = 0;
                while (yyy > 0) {
                    sumyyy = sumyyy + yyy % 10;
                    yyy = yyy / 10;
                }
            } else {
                sumyyy = yyy;
            }
            if(sumyyy > 9) {
                while (sumyyy > 0) {
                    sumyyyy = sumyyyy + sumyyy % 10;
                    sumyyy = sumyyy / 10;
                }
            } else {
                sumyyyy = sumyyy;
            }
            if(signyyy.equals("Negative")) {
                sumyyyy = sumyyyy * -1;
            }

            int xxx =  Math.abs(xx);
            int sumxxx;
            int sumxxxx = 0;
            if ((xxx > 9 & xxx < 1000) | (xxx < -9 & xxx > -1000)) {
                sumxxx = 0;
                while (xxx > 0) {
                    sumxxx = sumxxx + xxx % 10;
                    xxx = xxx / 10;
                }
            } else {
                sumxxx = xxx;
            }
            if(sumxxx > 9) {
                while (sumxxx > 0) {
                    sumxxxx = sumxxxx + sumxxx % 10;
                    sumxxx = sumxxx / 10;
                }
            } else {
                sumxxxx = sumxxx;
            }
            if(signxxx.equals("Negative")) {
                sumxxxx = sumxxxx * -1;
            }

            int ini_gd =  Math.abs(gdDiffi);
            int sum_ini_gd;
            int sum_fin_gd = 0;
            if ((ini_gd > 9 & ini_gd < 1000) | (ini_gd < -9 & ini_gd > -1000)) {
                sum_ini_gd = 0;
                while (ini_gd > 0) {
                    sum_ini_gd = sum_ini_gd + ini_gd % 10;
                    ini_gd = ini_gd / 10;
                }
            } else {
                sum_ini_gd = ini_gd;
            }
            if(sum_ini_gd > 9) {
                while (sum_ini_gd > 0) {
                    sum_fin_gd = sum_fin_gd + sum_ini_gd % 10;
                    sum_ini_gd = sum_ini_gd / 10;
                }
            } else {
                sum_fin_gd = sum_ini_gd;
            }
            if(signGDiffi.equals("Negative")) {
                sum_fin_gd = sum_fin_gd * -1;
            }

            int ini_had =  Math.abs(sDiffi);
            int sum_ini_had;
            int sum_fin_had = 0;
            if ((ini_had > 9 & ini_had < 1000) | (ini_had < -9 & ini_had > -1000)) {
                sum_ini_had = 0;
                while (ini_had > 0) {
                    sum_ini_had = sum_ini_had + ini_had % 10;
                    ini_had = ini_had / 10;
                }
            } else {
                sum_ini_had = ini_had;
            }
            if(sum_ini_had > 9) {
                while (sum_ini_had > 0) {
                    sum_fin_had = sum_fin_had + sum_ini_had % 10;
                    sum_ini_had = sum_ini_had / 10;
                }
            } else {
                sum_fin_had = sum_ini_had;
            }
            if(signsDiffi.equals("Negative")) {
                sum_fin_had = sum_fin_had * -1;
            }

            int ini_ad =  Math.abs(aDiffi);
            int sum_ini_ad;
            int sum_fin_ad = 0;
            if ((ini_ad > 9 & ini_ad < 1000) | (ini_ad < -9 & ini_ad > -1000)) {
                sum_ini_ad = 0;
                while (ini_ad > 0) {
                    sum_ini_ad = sum_ini_ad + ini_ad % 10;
                    ini_ad = ini_ad / 10;
                }
            } else {
                sum_ini_ad = ini_ad;
            }
            if(sum_ini_ad > 9) {
                while (sum_ini_ad > 0) {
                    sum_fin_ad = sum_fin_ad + sum_ini_ad % 10;
                    sum_ini_ad = sum_ini_ad / 10;
                }
            } else {
                sum_fin_ad = sum_ini_ad;
            }
            if(signaDiffi.equals("Negative")) {
                sum_fin_ad = sum_fin_ad * -1;
            }

            int ini_ptd =  Math.abs(pDiffi);
            int sum_ini_ptd;
            int sum_fin_ptd = 0;
            if ((ini_ptd > 9 & ini_ptd < 1000) | (ini_ptd < -9 & ini_ptd > -1000)) {
                sum_ini_ptd = 0;
                while (ini_ptd > 0) {
                    sum_ini_ptd = sum_ini_ptd + ini_ptd % 10;
                    ini_ptd = ini_ptd / 10;
                }
            } else {
                sum_ini_ptd = ini_ptd;
            }
            if(sum_ini_ptd > 9) {
                while (sum_ini_ptd > 0) {
                    sum_fin_ptd = sum_fin_ptd + sum_ini_ptd % 10;
                    sum_ini_ptd = sum_ini_ptd / 10;
                }
            } else {
                sum_fin_ptd = sum_ini_ptd;
            }
            if(signpDiffi.equals("Negative")) {
                sum_fin_ptd = sum_fin_ptd * -1;
            }



            String signxyPlus = checkPosNeg(xyPlus);
            String signxyMinus = checkPosNeg(xyMinus);

            int xyp_ld_tmp = lastDigit(xyPlus);
            int xym_ld_tmp = lastDigit(xyMinus);

            int xyp_ld;
            int xym_ld;

            String signsD_ld = checkPosNeg(sDiffi);

            if (signxyPlus.equals("Negative")) {
                xyp_ld = xyp_ld_tmp * -1;
            } else {
                xyp_ld = xyp_ld_tmp;
            }

            if (signxyMinus.equals("Negative")) {
                xym_ld = xym_ld_tmp * -1;
            } else {
                xym_ld = xym_ld_tmp;
            }

            int xx_ld = lastDigit(xx);
            int yy_ld = lastDigit(yy);

            int mplayedH = Integer.parseInt(MPH.getText().toString());
            int mplayedA = Integer.parseInt(MPA.getText().toString());

            String signt3 = checkPosNeg(t3);
            String signt4 = checkPosNeg(t4);
            String signt5 = checkPosNeg(t5);
            String signt6 = checkPosNeg(t6);
            String signu3 = checkPosNeg(u3);
            String signu4 = checkPosNeg(u4);
            String signu6 = checkPosNeg(u6);
            String signv4 = checkPosNeg(v4);
            String signv5 = checkPosNeg(v5);
            String signv6 = checkPosNeg(v6);

            int M = t5 - v4;
            int J = t4 - v5;

            int vv4 = t5 * -1;
            int vv5;

            if( (h2a * h1a) * (h2a - h1b) < 0 ) { vv5 = X - Y; } else { vv5 = X + Y; }

            String signvv4 = checkPosNeg(vv4);

            int vv4_ld = lastDigit(vv4);
            int vv5_ld = lastDigit(vv5);

            int bluel6minusl4 = v6 - v4;
            int bl_ld = lastDigit(bluel6minusl4);

            int dm1;
            int dm2;
            int dl2;
            if(signM1.equals("Negative")) {
                dm1 = m1_ld * -1;
            } else {
                dm1 = m1_ld;
            }

            if(signM2.equals("Negative")) {
                dm2 = m2_ld * -1;
            } else {
                dm2 = m2_ld;
            }

            if(signL2.equals("Negative")) {
                dl2 = l2_ld * -1;
            } else {
                dl2 = l2_ld;
            }

            if(gdDiffi < 0) {
                T1 = gdDiffi - pDiffi + v6;
            } else {
                T1 = gdDiffi + pDiffi + v6;
            }

            if(sDiffi < 0) {
                V1 = sDiffi - aDiffi + v6;
            } else {
                V1 = sDiffi + aDiffi + v6;
            }

            N1 = T1 + V1;

            if(xx < 0) {
                M1 = xx - yy + v6;
            } else {
                M1 = xx + yy + v6;
            }

            T2 = gdDiffi - pDiffi + v6;

            V2 = sDiffi - aDiffi + v6;

            N2 = T2 + V2;

            M2 = xx - yy + v6;

            Tx = T1 + T2;

            Vx = V1 + V2;

            Nx = Tx + Vx;

            Mx = M1 + M2;

            Blx = v4 + v5;
            Bly = v4 - v5;

            Mlx = M1 + M2;
            Mly = M2 - M1;

            BL = Blx + Bly;
            ML = Mlx + Mly;

            R1 = (v5 + vv5) + (2 * gdDiffi) - yy;
            R2 = R1 - xx;

            C = Bly + Mlx;

            W = Mlx - Blx;
            Z = Mly - Bly;
            D = W - Z;

            R1R2f = Math.abs(R1) + Math.abs(R2);
            R1mR2f = Math.abs(R1) - Math.abs(R2);
            N2M2f = Math.abs(N2) + Math.abs(M2);
            N2mM2 = N2 - M2;
            NxmMx = Nx - Mx;
            NxmMxf = Math.abs(Nx) - Math.abs(Mx);
            NxMxf = Math.abs(Nx) + Math.abs(Mx);

            int N;
            int R;
            int Ny;
            int Rx;
            int Nd;
            int Ne;
            int Nn;

            N = Math.abs(N2) + Math.abs(M2);
            Ny = Nx - Mx;
            Nd = Math.abs(N1) + Math.abs(N2);
            Ne = Math.abs(N1) - Math.abs(N2);
            R = Math.abs(R1) + Math.abs(R2);
            Rx = Math.abs(R1) - Math.abs(R2);
            Nn = Math.abs(Nx) + Math.abs(Mx);


            if(ML <= 0) {
                BM1 = BL + ML;
            } else {
                BM1 = BL - ML;
            }

            N0 = N2 - M1;
            M0 = N1 - M2;

            MN0 = N0 + M0;

            BM2 = BL + ML;

            int Tx_ld = lastDigit(Tx);
            int T1_ld = lastDigit(T1);
            int T2_ld = lastDigit(T2);
            int Vx_ld = lastDigit(Vx);
            int V1_ld = lastDigit(V1);
            int V2_ld = lastDigit(V2);
            int Nx_ld = lastDigit(Nx);
            int N2_ld = lastDigit(N2);
            int N1_ld = lastDigit(N1);
            int Mx_ld = lastDigit(Mx);
            int M1_ld = lastDigit(M1);
            int M2_ld = lastDigit(M2);
            int Blx_ld = lastDigit(Blx);
            int Bly_ld = lastDigit(Bly);
            int BL_ld = lastDigit(BL);
            int Mlx_ld = lastDigit(Mlx);
            int Mly_ld = lastDigit(Mly);
            int ML_ld = lastDigit(ML);
            int BM1_ld = lastDigit(BM1);
            int BM2_ld = lastDigit(BM2);
            int R1_ld = lastDigit(R1);
            int R2_ld = lastDigit(R2);
            int R1R2f_ld = lastDigit(R1R2f);

            String signTx = checkPosNeg(Tx);
            int Txr =  Math.abs(Tx);
            int Txrr;
            int Txrrr = 0;
            if ((Txr > 9 & Txr < 1000) | (Txr < -9 & Txr > -1000)) {
                Txrr = 0;
                while (Txr > 0) {
                    Txrr = Txrr + Txr % 10;
                    Txr = Txr / 10;
                }
            } else {
                Txrr = Txr;
            }
            if(Txrr > 9) {
                while (Txrr > 0) {
                    Txrrr = Txrrr + Txrr % 10;
                    Txrr = Txrr / 10;
                }
            } else {
                Txrrr = Txrr;
            }
            if(signTx.equals("Negative")) {
                Txrrr = Txrrr * -1;
            }

            String signT1 = checkPosNeg(T1);
            int T1r =  Math.abs(T1);
            int T1rr;
            int T1rrr = 0;
            if ((T1r > 9 & T1r < 1000) | (T1r < -9 & T1r > -1000)) {
                T1rr = 0;
                while (T1r > 0) {
                    T1rr = T1rr + T1r % 10;
                    T1r = T1r / 10;
                }
            } else {
                T1rr = T1r;
            }
            if(T1rr > 9) {
                while (T1rr > 0) {
                    T1rrr = T1rrr + T1rr % 10;
                    T1rr = T1rr / 10;
                }
            } else {
                T1rrr = T1rr;
            }
            if(signT1.equals("Negative")) {
                T1rrr = T1rrr * -1;
            }

            String signT2 = checkPosNeg(T2);
            int T2r =  Math.abs(T2);
            int T2rr;
            int T2rrr = 0;
            if ((T2r > 9 & T2r < 1000) | (T2r < -9 & T2r > -1000)) {
                T2rr = 0;
                while (T2r > 0) {
                    T2rr = T2rr + T2r % 10;
                    T2r = T2r / 10;
                }
            } else {
                T2rr = T2r;
            }
            if(T2rr > 9) {
                while (T2rr > 0) {
                    T2rrr = T2rrr + T2rr % 10;
                    T2rr = T2rr / 10;
                }
            } else {
                T2rrr = T2rr;
            }
            if(signT2.equals("Negative")) {
                T2rrr = T2rrr * -1;
            }

            String signVx = checkPosNeg(Vx);
            int Vxr =  Math.abs(Vx);
            int Vxrr;
            int Vxrrr = 0;
            if ((Vxr > 9 & Txr < 1000) | (Vxr < -9 & Vxr > -1000)) {
                Vxrr = 0;
                while (Vxr > 0) {
                    Vxrr = Vxrr + Vxr % 10;
                    Vxr = Vxr / 10;
                }
            } else {
                Vxrr = Vxr;
            }
            if(Vxrr > 9) {
                while (Vxrr > 0) {
                    Vxrrr = Vxrrr + Vxrr % 10;
                    Vxrr = Vxrr / 10;
                }
            } else {
                Vxrrr = Vxrr;
            }
            if(signVx.equals("Negative")) {
                Vxrrr = Vxrrr * -1;
            }

            String signV1 = checkPosNeg(V1);
            int V1r =  Math.abs(V1);
            int V1rr;
            int V1rrr = 0;
            if ((V1r > 9 & V1r < 1000) | (V1r < -9 & V1r > -1000)) {
                V1rr = 0;
                while (V1r > 0) {
                    V1rr = V1rr + V1r % 10;
                    V1r = V1r / 10;
                }
            } else {
                V1rr = V1r;
            }
            if(V1rr > 9) {
                while (V1rr > 0) {
                    V1rrr = V1rrr + V1rr % 10;
                    V1rr = V1rr / 10;
                }
            } else {
                V1rrr = V1rr;
            }
            if(signV1.equals("Negative")) {
                V1rrr = V1rrr * -1;
            }

            String signV2 = checkPosNeg(V2);
            int V2r =  Math.abs(V2);
            int V2rr;
            int V2rrr = 0;
            if ((V2r > 9 & V2r < 1000) | (V2r < -9 & V2r > -1000)) {
                V2rr = 0;
                while (V2r > 0) {
                    V2rr = V2rr + V2r % 10;
                    V2r = V2r / 10;
                }
            } else {
                V2rr = V2r;
            }
            if(V2rr > 9) {
                while (V2rr > 0) {
                    V2rrr = V2rrr + V2rr % 10;
                    V2rr = V2rr / 10;
                }
            } else {
                V2rrr = V2rr;
            }
            if(signV2.equals("Negative")) {
                V2rrr = V2rrr * -1;
            }

            String signNx = checkPosNeg(Nx);
            int Nxr =  Math.abs(Nx);
            int Nxrr;
            int Nxrrr = 0;
            if ((Nxr > 9 & Nxr < 1000) | (Nxr < -9 & Nxr > -1000)) {
                Nxrr = 0;
                while (Nxr > 0) {
                    Nxrr = Nxrr + Nxr % 10;
                    Nxr = Nxr / 10;
                }
            } else {
                Nxrr = Nxr;
            }
            if(Nxrr > 9) {
                while (Nxrr > 0) {
                    Nxrrr = Nxrrr + Nxrr % 10;
                    Nxrr = Nxrr / 10;
                }
            } else {
                Nxrrr = Nxrr;
            }
            if(signNx.equals("Negative")) {
                Nxrrr = Nxrrr * -1;
            }

            String signN1 = checkPosNeg(N1);
            int N1r =  Math.abs(N1);
            int N1rr;
            int N1rrr = 0;
            if ((N1r > 9 & N1r < 1000) | (N1r < -9 & N1r > -1000)) {
                N1rr = 0;
                while (N1r > 0) {
                    N1rr = N1rr + N1r % 10;
                    N1r = N1r / 10;
                }
            } else {
                N1rr = N1r;
            }
            if(N1rr > 9) {
                while (N1rr > 0) {
                    N1rrr = N1rrr + N1rr % 10;
                    N1rr = N1rr / 10;
                }
            } else {
                N1rrr = N1rr;
            }
            if(signN1.equals("Negative")) {
                N1rrr = N1rrr * -1;
            }

            String signN2 = checkPosNeg(N2);
            int N2r =  Math.abs(N2);
            int N2rr;
            int N2rrr = 0;
            if ((N2r > 9 & N2r < 1000) | (N2r < -9 & N2r > -1000)) {
                N2rr = 0;
                while (N2r > 0) {
                    N2rr = N2rr + N2r % 10;
                    N2r = N2r / 10;
                }
            } else {
                N2rr = N2r;
            }
            if(N2rr > 9) {
                while (N2rr > 0) {
                    N2rrr = N2rrr + N2rr % 10;
                    N2rr = N2rr / 10;
                }
            } else {
                N2rrr = N2rr;
            }
            if(signN2.equals("Negative")) {
                N2rrr = N2rrr * -1;
            }

            String signMx = checkPosNeg(Mx);
            int Mxr =  Math.abs(Mx);
            int Mxrr;
            int Mxrrr = 0;
            if ((Mxr > 9 & Mxr < 1000) | (Mxr < -9 & Mxr > -1000)) {
                Mxrr = 0;
                while (Mxr > 0) {
                    Mxrr = Mxrr + Mxr % 10;
                    Mxr = Mxr / 10;
                }
            } else {
                Mxrr = Mxr;
            }
            if(Mxrr > 9) {
                while (Mxrr > 0) {
                    Mxrrr = Mxrrr + Mxrr % 10;
                    Mxrr = Mxrr / 10;
                }
            } else {
                Mxrrr = Mxrr;
            }
            if(signMx.equals("Negative")) {
                Mxrrr = Mxrrr * -1;
            }

            String signMM1 = checkPosNeg(M1);
            int M1r =  Math.abs(M1);
            int M1rr;
            int M1rrr = 0;
            if ((M1r > 9 & M1r < 1000) | (M1r < -9 & M1r > -1000)) {
                M1rr = 0;
                while (M1r > 0) {
                    M1rr = M1rr + M1r % 10;
                    M1r = M1r / 10;
                }
            } else {
                M1rr = M1r;
            }
            if(M1rr > 9) {
                while (M1rr > 0) {
                    M1rrr = M1rrr + M1rr % 10;
                    M1rr = M1rr / 10;
                }
            } else {
                M1rrr = M1rr;
            }
            if(signMM1.equals("Negative")) {
                M1rrr = M1rrr * -1;
            }

            String signMM2 = checkPosNeg(M2);
            int M2r =  Math.abs(M2);
            int M2rr;
            int M2rrr = 0;
            if ((M2r > 9 & M2r < 1000) | (M2r < -9 & M2r > -1000)) {
                M2rr = 0;
                while (M2r > 0) {
                    M2rr = M2rr + M2r % 10;
                    M2r = M2r / 10;
                }
            } else {
                M2rr = M2r;
            }
            if(M2rr > 9) {
                while (M2rr > 0) {
                    M2rrr = M2rrr + M2rr % 10;
                    M2rr = M2rr / 10;
                }
            } else {
                M2rrr = M2rr;
            }
            if(signMM2.equals("Negative")) {
                M2rrr = M2rrr * -1;
            }

            String signBlx = checkPosNeg(Blx);
            int Blxr =  Math.abs(Blx);
            int Blxrr;
            int Blxrrr = 0;
            if ((Blxr > 9 & Blxr < 1000) | (Blxr < -9 & Blxr > -1000)) {
                Blxrr = 0;
                while (Blxr > 0) {
                    Blxrr = Blxrr + Blxr % 10;
                    Blxr = Blxr / 10;
                }
            } else {
                Blxrr = Blxr;
            }
            if(Blxrr > 9) {
                while (Blxrr > 0) {
                    Blxrrr = Blxrrr + Blxrr % 10;
                    Blxrr = Blxrr / 10;
                }
            } else {
                Blxrrr = Blxrr;
            }
            if(signBlx.equals("Negative")) {
                Blxrrr = Blxrrr * -1;
            }

            String signBly = checkPosNeg(Bly);
            int Blyr =  Math.abs(Bly);
            int Blyrr;
            int Blyrrr = 0;
            if ((Blyr > 9 & Blyr < 1000) | (Blyr < -9 & Blyr > -1000)) {
                Blyrr = 0;
                while (Blyr > 0) {
                    Blyrr = Blyrr + Blyr % 10;
                    Blyr = Blyr / 10;
                }
            } else {
                Blyrr = Blyr;
            }
            if(Blyrr > 9) {
                while (Blyrr > 0) {
                    Blyrrr = Blyrrr + Blyrr % 10;
                    Blyrr = Blyrr / 10;
                }
            } else {
                Blyrrr = Blyrr;
            }
            if(signBly.equals("Negative")) {
                Blyrrr = Blyrrr * -1;
            }

            String signBL = checkPosNeg(BL);
            int BLr =  Math.abs(BL);
            int BLrr;
            int BLrrr = 0;
            if ((BLr > 9 & BLr < 1000) | (BLr < -9 & BLr > -1000)) {
                BLrr = 0;
                while (BLr > 0) {
                    BLrr = BLrr + BLr % 10;
                    BLr = BLr / 10;
                }
            } else {
                BLrr = BLr;
            }
            if(BLrr > 9) {
                while (BLrr > 0) {
                    BLrrr = BLrrr + BLrr % 10;
                    BLrr = BLrr / 10;
                }
            } else {
                BLrrr = BLrr;
            }
            if(signBL.equals("Negative")) {
                BLrrr = BLrrr * -1;
            }

            String signMlx = checkPosNeg(Mlx);
            int Mlxr =  Math.abs(Mlx);
            int Mlxrr;
            int Mlxrrr = 0;
            if ((Mlxr > 9 & Mlxr < 1000) | (Mlxr < -9 & Mlxr > -1000)) {
                Mlxrr = 0;
                while (Mlxr > 0) {
                    Mlxrr = Mlxrr + Mlxr % 10;
                    Mlxr = Mlxr / 10;
                }
            } else {
                Mlxrr = Mlxr;
            }
            if(Mlxrr > 9) {
                while (Mlxrr > 0) {
                    Mlxrrr = Mlxrrr + Mlxrr % 10;
                    Mlxrr = Mlxrr / 10;
                }
            } else {
                Mlxrrr = Mlxrr;
            }
            if(signMlx.equals("Negative")) {
                Mlxrrr = Mlxrrr * -1;
            }

            String signMly = checkPosNeg(Mly);
            int Mlyr =  Math.abs(Mly);
            int Mlyrr;
            int Mlyrrr = 0;
            if ((Mlyr > 9 & Mlyr < 1000) | (Mlyr < -9 & Mlyr > -1000)) {
                Mlyrr = 0;
                while (Mlyr > 0) {
                    Mlyrr = Mlyrr + Mlyr % 10;
                    Mlyr = Mlyr / 10;
                }
            } else {
                Mlyrr = Mlyr;
            }
            if(Mlyrr > 9) {
                while (Mlyrr > 0) {
                    Mlyrrr = Mlyrrr + Mlyrr % 10;
                    Mlyrr = Mlyrr / 10;
                }
            } else {
                Mlyrrr = Mlyrr;
            }
            if(signMly.equals("Negative")) {
                Mlyrrr = Mlyrrr * -1;
            }

            String signML = checkPosNeg(ML);
            int MLr =  Math.abs(ML);
            int MLrr;
            int MLrrr = 0;
            if ((MLr > 9 & MLr < 1000) | (MLr < -9 & MLr > -1000)) {
                MLrr = 0;
                while (MLr > 0) {
                    MLrr = MLrr + MLr % 10;
                    MLr = MLr / 10;
                }
            } else {
                MLrr = MLr;
            }
            if(MLrr > 9) {
                while (MLrr > 0) {
                    MLrrr = MLrrr + MLrr % 10;
                    MLrr = MLrr / 10;
                }
            } else {
                MLrrr = MLrr;
            }
            if(signML.equals("Negative")) {
                MLrrr = MLrrr * -1;
            }

            int J1 = N2 - M2;
            String signJ1 = checkPosNeg(J1);
            int J1r =  Math.abs(J1);
            int J1rr;
            int J1rrr = 0;
            if ((J1r > 9 & J1r < 1000) | (J1r < -9 & J1r > -1000)) {
                J1rr = 0;
                while (J1r > 0) {
                    J1rr = J1rr + J1r % 10;
                    J1r = J1r / 10;
                }
            } else {
                J1rr = J1r;
            }
            if(J1rr > 9) {
                while (J1rr > 0) {
                    J1rrr = J1rrr + J1rr % 10;
                    J1rr = J1rr / 10;
                }
            } else {
                J1rrr = J1rr;
            }
            if(signJ1.equals("Negative")) {
                J1rrr = J1rrr * -1;
            }

            String signBM1 = checkPosNeg(BM1);
            int BM1r =  Math.abs(BM1);
            int BM1rr;
            int BM1rrr = 0;
            if ((BM1r > 9 & BM1r < 1000) | (BM1r < -9 & BM1r > -1000)) {
                BM1rr = 0;
                while (BM1r > 0) {
                    BM1rr = BM1rr + BM1r % 10;
                    BM1r = BM1r / 10;
                }
            } else {
                BM1rr = BM1r;
            }
            if(BM1rr > 9) {
                while (BM1rr > 0) {
                    BM1rrr = BM1rrr + BM1rr % 10;
                    BM1rr = BM1rr / 10;
                }
            } else {
                BM1rrr = BM1rr;
            }
            if(signBM1.equals("Negative")) {
                BM1rrr = BM1rrr * -1;
            }

            String signBM2 = checkPosNeg(BM2);
            int BM2r =  Math.abs(BM2);
            int BM2rr;
            int BM2rrr = 0;
            if ((BM2r > 9 & BM2r < 1000) | (BM2r < -9 & BM2r > -1000)) {
                BM2rr = 0;
                while (BM2r > 0) {
                    BM2rr = BM2rr + BM2r % 10;
                    BM2r = BM2r / 10;
                }
            } else {
                BM2rr = BM2r;
            }
            if(BM2rr > 9) {
                while (BM2rr > 0) {
                    BM2rrr = BM2rrr + BM2rr % 10;
                    BM2rr = BM2rr / 10;
                }
            } else {
                BM2rrr = BM2rr;
            }
            if(signBM2.equals("Negative")) {
                BM2rrr = BM2rrr * -1;
            }

            String signR1 = checkPosNeg(R1);
            int R1r =  Math.abs(R1);
            int R1rr;
            int R1rrr = 0;
            if ((R1r > 9 & R1r < 1000) | (R1r < -9 & R1r > -1000)) {
                R1rr = 0;
                while (R1r > 0) {
                    R1rr = R1rr + R1r % 10;
                    R1r = R1r / 10;
                }
            } else {
                R1rr = R1r;
            }
            if(R1rr > 9) {
                while (R1rr > 0) {
                    R1rrr = R1rrr + R1rr % 10;
                    R1rr = R1rr / 10;
                }
            } else {
                R1rrr = R1rr;
            }
            if(signR1.equals("Negative")) {
                R1rrr = R1rrr * -1;
            }

            String signR2 = checkPosNeg(R2);
            int R2r =  Math.abs(R2);
            int R2rr;
            int R2rrr = 0;
            if ((R2r > 9 & R2r < 1000) | (R2r < -9 & R2r > -1000)) {
                R2rr = 0;
                while (R2r > 0) {
                    R2rr = R2rr + R2r % 10;
                    R2r = R2r / 10;
                }
            } else {
                R2rr = R2r;
            }
            if(R2rr > 9) {
                while (R2rr > 0) {
                    R2rrr = R2rrr + R2rr % 10;
                    R2rr = R2rr / 10;
                }
            } else {
                R2rrr = R2rr;
            }
            if(signR2.equals("Negative")) {
                R2rrr = R2rrr * -1;
            }

            String signR1R2 = checkPosNeg(R1R2f);
            int R1R2r =  Math.abs(R1R2f);
            int R1R2rr;
            int R1R2rrr = 0;
            if ((R1R2r > 9 & R1R2r < 1000) | (R1R2r < -9 & R1R2r > -1000)) {
                R1R2rr = 0;
                while (R1R2r > 0) {
                    R1R2rr = R1R2rr + R1R2r % 10;
                    R1R2r = R1R2r / 10;
                }
            } else {
                R1R2rr = R1R2r;
            }
            if(R1R2rr > 9) {
                while (R1R2rr > 0) {
                    R1R2rrr = R1R2rrr + R1R2rr % 10;
                    R1R2rr = R1R2rr / 10;
                }
            } else {
                R1R2rrr = R1R2rr;
            }
            if(signR1R2.equals("Negative")) {
                R1R2rrr = R1R2rrr * -1;
            }

            //String signgdH = checkPosNeg(gdH);
            int gdHr =  Math.abs(gdH);
            int gdHrr;
            int gdHrrr = 0;
            if ((gdHr > 9 & gdHr < 1000) | (gdHr < -9 & gdHr > -1000)) {
                gdHrr = 0;
                while (gdHr > 0) {
                    gdHrr = gdHrr + gdHr % 10;
                    gdHr = gdHr / 10;
                }
            } else {
                gdHrr = gdHr;
            }
            if(gdHrr > 9) {
                while (gdHrr > 0) {
                    gdHrrr = gdHrrr + gdHrr % 10;
                    gdHrr = gdHrr / 10;
                }
            } else {
                gdHrrr = gdHrr;
            }
            if(signgdH.equals("Negative")) {
                gdHrrr = gdHrrr * -1;
            }

            int gdAr =  Math.abs(gdA);
            int gdArr;
            int gdArrr = 0;
            if ((gdAr > 9 & gdAr < 1000) | (gdAr < -9 & gdAr > -1000)) {
                gdArr = 0;
                while (gdAr > 0) {
                    gdArr = gdArr + gdAr % 10;
                    gdAr = gdAr / 10;
                }
            } else {
                gdArr = gdAr;
            }
            if(gdArr > 9) {
                while (gdArr > 0) {
                    gdArrr = gdArrr + gdArr % 10;
                    gdArr = gdArr / 10;
                }
            } else {
                gdArrr = gdArr;
            }
            if(signgdA.equals("Negative")) {
                gdArrr = gdArrr * -1;
            }

            String signmpH = checkPosNeg(mpH);
            int mpHr =  Math.abs(mpH);
            int mpHrr;
            int mpHrrr = 0;
            if ((mpHr > 9 & mpHr < 1000) | (mpHr < -9 & mpHr > -1000)) {
                mpHrr = 0;
                while (mpHr > 0) {
                    mpHrr = mpHrr + mpHr % 10;
                    mpHr = mpHr / 10;
                }
            } else {
                mpHrr = mpHr;
            }
            if(mpHrr > 9) {
                while (mpHrr > 0) {
                    mpHrrr = mpHrrr + mpHrr % 10;
                    mpHrr = mpHrr / 10;
                }
            } else {
                mpHrrr = mpHrr;
            }
            if(signmpH.equals("Negative")) {
                mpHrrr = mpHrrr * -1;
            }

            String signmpA = checkPosNeg(mpA);
            int mpAr =  Math.abs(mpA);
            int mpArr;
            int mpArrr = 0;
            if ((mpAr > 9 & mpAr < 1000) | (mpAr < -9 & mpAr > -1000)) {
                mpArr = 0;
                while (mpAr > 0) {
                    mpArr = mpArr + mpAr % 10;
                    mpAr = mpAr / 10;
                }
            } else {
                mpArr = mpAr;
            }
            if(mpArr > 9) {
                while (mpArr > 0) {
                    mpArrr = mpArrr + mpArr % 10;
                    mpArr = mpArr / 10;
                }
            } else {
                mpArrr = mpArr;
            }
            if(signmpA.equals("Negative")) {
                mpArrr = mpArrr * -1;
            }

            String signpointsH = checkPosNeg(pointsH);
            int pointsHr =  Math.abs(pointsH);
            int pointsHrr;
            int pointsHrrr = 0;
            if ((pointsHr > 9 & pointsHr < 1000) | (pointsHr < -9 & pointsHr > -1000)) {
                pointsHrr = 0;
                while (pointsHr > 0) {
                    pointsHrr = pointsHrr + pointsHr % 10;
                    pointsHr = pointsHr / 10;
                }
            } else {
                pointsHrr = pointsHr;
            }
            if(pointsHrr > 9) {
                while (pointsHrr > 0) {
                    pointsHrrr = pointsHrrr + pointsHrr % 10;
                    pointsHrr = pointsHrr / 10;
                }
            } else {
                pointsHrrr = pointsHrr;
            }
            if(signpointsH.equals("Negative")) {
                pointsHrrr = pointsHrrr * -1;
            }

            String signpointsA = checkPosNeg(pointsA);
            int pointsAr =  Math.abs(pointsA);
            int pointsArr;
            int pointsArrr = 0;
            if ((pointsAr > 9 & pointsAr < 1000) | (pointsAr < -9 & pointsAr > -1000)) {
                pointsArr = 0;
                while (pointsAr > 0) {
                    pointsArr = pointsArr + pointsAr % 10;
                    pointsAr = pointsAr / 10;
                }
            } else {
                pointsArr = pointsAr;
            }
            if(pointsArr > 9) {
                while (pointsArr > 0) {
                    pointsArrr = pointsArrr + pointsArr % 10;
                    pointsArr = pointsArr / 10;
                }
            } else {
                pointsArrr = pointsArr;
            }
            if(signpointsA.equals("Negative")) {
                pointsArrr = pointsArrr * -1;
            }


            String signN0 = checkPosNeg(N0);
            int N0r =  Math.abs(N0);
            int N0rr;
            int N0rrr = 0;
            if ((N0r > 9 & N0r < 1000) | (N0r < -9 & N0r > -1000)) {
                N0rr = 0;
                while (N0r > 0) {
                    N0rr = N0rr + N0r % 10;
                    N0r = N0r / 10;
                }
            } else {
                N0rr = N0r;
            }
            if(N0rr > 9) {
                while (N0rr > 0) {
                    N0rrr = N0rrr + N0rr % 10;
                    N0rr = N0rr / 10;
                }
            } else {
                N0rrr = N0rr;
            }
            if(signN0.equals("Negative")) {
                N0rrr = N0rrr * -1;
            }

            String signM0 = checkPosNeg(M0);
            int M0r =  Math.abs(M0);
            int M0rr;
            int M0rrr = 0;
            if ((M0r > 9 & M0r < 1000) | (M0r < -9 & M0r > -1000)) {
                M0rr = 0;
                while (M0r > 0) {
                    M0rr = M0rr + M0r % 10;
                    M0r = M0r / 10;
                }
            } else {
                M0rr = M0r;
            }
            if(M0rr > 9) {
                while (M0rr > 0) {
                    M0rrr = M0rrr + M0rr % 10;
                    M0rr = M0rr / 10;
                }
            } else {
                M0rrr = M0rr;
            }
            if(signM0.equals("Negative")) {
                M0rrr = M0rrr * -1;
            }

            B = Blx + Mly;

            int V1N2 = V1 + N2;
            int V2N1 = V2 + N1;
            
            GP = gdDiffi + pDiffi;
            XY = xx + yy;

            NGP = GP + BL + C;
            NXY = XY + ML + B;
            
            XB = xx + BL;
            YM = yy + ML;

            NYM = YM + B + N0;
            NXB = XB + C + M0;
            
            G = GP - NGP;
            V = XY-NXY;
            
            Gt = GP + NGP;
            Vt = XY + NXY;

            GV = V - G;
            GVT = Vt - Gt;
            OX = YM+NYM;
            OY = XB+NXB;

            int GVTOX;
            int GVOY;
            GVTOX = GVT + OX;
            GVOY = GV+OY;

            x1 = XY+NGP;
            y1 = GP+NXY;
            x2 = XY-NGP;
            y2 = GP-NXY;
            x1x2 = x1+x2;
            y1y2 = y1+y2;

            xn = x1x2 + M0;
            ym = y1y2 + N0;

            xx1 = x2+y1;
            yy1 = x1+y2;
            xd = x1x2+xx1;
            yd = y1y2+yy1;
            xd1 = x1x2 - xx1;
            yd1 = y1y2 - yy1;
            x3 = xd + xd1;
            y3 = yd + yd1;

            int hplus = h3a + h3b;
            int gplus = g1 + g2;
            first_analysis_table.setVisibility(View.VISIBLE);
            n1_txt.setText(Integer.toString(n1));
            a1_txt.setText(Integer.toString(a1));
            a2_txt.setText(Integer.toString(a2));
            h1a_txt.setText(Integer.toString(h1a));
            h1b_txt.setText(Integer.toString(h1b));
            b1_txt.setText(Integer.toString(b1));
            b2_txt.setText(Integer.toString(b2));
            non_abs_home_txt.setText(Integer.toString(non_abs_home));
            non_abs_away_txt.setText(Integer.toString(non_abs_away));
            h2a_txt.setText(Integer.toString(h2a));
            h2b_txt.setText(Integer.toString(h2b));
            c1_txt.setText(Integer.toString(c1));
            c2_txt.setText(Integer.toString(c2));
            abs_home_txt.setText(Integer.toString(abs_home));
            abs_away_txt.setText(Integer.toString(abs_away));
            h3a_txt.setText(Integer.toString(h3a));
            h3b_txt.setText(Integer.toString(h3b));
            d1_txt.setText(Integer.toString(d1));
            d2_txt.setText(Integer.toString(d2));
            d3_txt.setText(Integer.toString(d3));
            n2_txt.setText(Integer.toString(n2));
            r1a_txt.setText(Integer.toString(r1a));
            r1b_txt.setText(Integer.toString(r1b));
            g1_txt.setText(Integer.toString(g1));
            g2_txt.setText(Integer.toString(g2));
            r2a_txt.setText(Integer.toString(r2a));
            r2b_txt.setText(Integer.toString(r2b));
            r3a_txt.setText(Integer.toString(r3a));
            r3b_txt.setText(Integer.toString(r3b));
            l2_txt.setText(Integer.toString(l2));
            l3_txt.setText(Integer.toString(l3));
            l4_txt.setText(Integer.toString(l4));
            l5_txt.setText(Integer.toString(l5));
            l6_txt.setText(Integer.toString(l6));
            //l7_txt.setText(l7);
            m1_txt.setText(Integer.toString(m1));
            m2_txt.setText(Integer.toString(m2));
            m3_txt.setText(Integer.toString(m3));
            m4_txt.setText(Integer.toString(m4));
            m6_txt.setText(Integer.toString(m6));
            //m7_txt.setText(m7);
            X1_txt.setText(Integer.toString(gdDiffi));
            X2_txt.setText(Integer.toString(pDiffi));
            Y1_txt.setText(Integer.toString(sDiffi));
            Y2_txt.setText(Integer.toString(aDiffi));
            Z1_txt.setText(Integer.toString(xx));
            Z2_txt.setText(Integer.toString(yy));
            t3_txt.setText(Integer.toString(t3));
            t4_txt.setText(Integer.toString(t4));
            t5_txt.setText(Integer.toString(t5));
            t6_txt.setText(Integer.toString(t6));
            u3_txt.setText(Integer.toString(u3));
            u4_txt.setText(Integer.toString(u4));
            u6_txt.setText(Integer.toString(u6));
            //u7_txt.setText(u7);
            v4_txt.setText(Integer.toString(v4));
            v5_txt.setText(Integer.toString(v5));
            v6_txt.setText(Integer.toString(v6));
            vv4_txt.setText(Integer.toString(v4));
            vv5_txt.setText(Integer.toString(vv5));
            Tx_txt.setText(Integer.toString(Tx));
            Log.d("what", String.valueOf(Tx));
            T2_txt.setText(Integer.toString(T2));
            T1_txt.setText(Integer.toString(T1));
            Blx_txt.setText(Integer.toString(Blx));
            Bly_txt.setText(Integer.toString(Bly));
            BL_txt.setText(Integer.toString(BL));
            Vx_txt.setText(Integer.toString(Vx));
            V2_txt.setText(Integer.toString(V2));
            V1_txt.setText(Integer.toString(V1));
            Mlx_txt.setText(Integer.toString(Mlx));
            Mly_txt.setText(Integer.toString(Mly));
            ML_txt.setText(Integer.toString(ML));
            Nx_txt.setText(Integer.toString(Nx));
            N2_txt.setText(Integer.toString(N2));
            N1_txt.setText(Integer.toString(N1));
            BM1_txt.setText(Integer.toString(BM1));
            BM2_txt.setText(Integer.toString(BM2));
            Mx_txt.setText(Integer.toString(Mx));
            M2_txt.setText(Integer.toString(M2));
            M1_txt.setText(Integer.toString(M1));
            R1_txt.setText(Integer.toString(R1));
            R2_txt.setText(Integer.toString(R2));
            R1R2f_txt.setText(Integer.toString(R1R2f));
            N_txt.setText(Integer.toString(N));
            Ny_txt.setText(Integer.toString(Ny));
            Nd_txt.setText(Integer.toString(Nd));
            Ne_txt.setText(Integer.toString(Ne));
            R_txt.setText(Integer.toString(R));
            Rx_txt.setText(Integer.toString(Rx));
            Nn_txt.setText(Integer.toString(Nn));
            B_txt.setText(Integer.toString(B));
            V1N2_txt.setText(Integer.toString(V1N2));
            V2N1_txt.setText(Integer.toString(V2N1));
            ////
            M0_txt.setText(Integer.toString(M0));
            N0_txt.setText(Integer.toString(N0));
            MN0_txt.setText(Integer.toString(MN0));
            GP_txt.setText(Integer.toString(NGP));
            XY_txt.setText(Integer.toString(NXY));
            oGP_txt.setText(Integer.toString(GP));
            oXY_txt.setText(Integer.toString(XY));
            XB_txt.setText(Integer.toString(xd));
            YM_txt.setText(Integer.toString(yd));
            NXB_txt.setText(Integer.toString(xd1));
            NYM_txt.setText(Integer.toString(yd1));
            G_txt.setText(Integer.toString(G));
            V_txt.setText(Integer.toString(V));
            Gt_txt.setText(Integer.toString(Gt));
            Vt_txt.setText(Integer.toString(Vt));
            GV_txt.setText(Integer.toString(xx1));
            GVT_txt.setText(Integer.toString(yy1));
            OX_txt.setText(Integer.toString(x3));
            OY_txt.setText(Integer.toString(y3));
            x1_txt.setText(Integer.toString(x1));
            y1_txt.setText(Integer.toString(y1));
            x2_txt.setText(Integer.toString(x2));
            y2_txt.setText(Integer.toString(y2));
            xx_txt.setText(Integer.toString(x1x2));
            yy_txt.setText(Integer.toString(y1y2));
            xn_txt.setText(Integer.toString(xn));
            ym_txt.setText(Integer.toString(ym));
            xx2_txt.setText(Integer.toString(x1x2));
            yy2_txt.setText(Integer.toString(y1y2));

            progress_txt.setVisibility(View.GONE);


            /* Turns */
            /*
            if(T2 > V2) {
                init_res = "H";
            }

            if(T2 < V2) {
                init_res = "A";
            }

            if(T2 == V2) {
                init_res = "Void";
            }

             */

            int VV = T1 + V2;
            int NN = T2 + V1;

            String signVV = checkPosNeg(VV);
            int VVr =  Math.abs(VV);
            int VVrr;
            int VVrrr = 0;
            if ((VVr > 9 & VVr < 1000) | (VVr < -9 & VVr > -1000)) {
                VVrr = 0;
                while (VVr > 0) {
                    VVrr = VVrr + VVr % 10;
                    VVr = VVr / 10;
                }
            } else {
                VVrr = VVr;
            }
            if(VVrr > 9) {
                while (VVrr > 0) {
                    VVrrr = VVrrr + VVrr % 10;
                    VVrr = VVrr / 10;
                }
            } else {
                VVrrr = VVrr;
            }
            if(signVV.equals("Negative")) {
                VVrrr = VVrrr * -1;
            }

            String signNN = checkPosNeg(NN);
            int NNr =  Math.abs(NN);
            int NNrr;
            int NNrrr = 0;
            if ((NNr > 9 & NNr < 1000) | (NNr < -9 & NNr > -1000)) {
                NNrr = 0;
                while (NNr > 0) {
                    NNrr = NNrr + NNr % 10;
                    NNr = NNr / 10;
                }
            } else {
                NNrr = NNr;
            }
            if(NNrr > 9) {
                while (NNrr > 0) {
                    NNrrr = NNrrr + NNrr % 10;
                    NNrr = NNrr / 10;
                }
            } else {
                NNrrr = NNrr;
            }
            if(signNN.equals("Negative")) {
                NNrrr = NNrrr * -1;
            }

            VV_txt.setText(Integer.toString(VV));
            NN_txt.setText(Integer.toString(NN));

            if(NN < VV) {
                init_res = "A";
            }

            if(NN > VV) {
                init_res = "H";
            }

            if(NN == VV) {
                init_res = "Void";
            }

            res = init_res;

            if(res.equals("Void")) {} else {

                Log.d("Final Analysis", res);

            }

            // Draw Analysis
            ds_res = "";
           

            int NR;
            if(res.equals("A")) {
                NR = N2 - M2;
            } else {
                NR = N2 + M2;
            }

            if(Math.abs(NR) < 80 & res.equals("A")) {
                nN = N2 - M2;
                mM = N2 - M1;
            }

            if(Math.abs(NR) < 80 & res.equals("H")) {
                nN = N2 + M2;
                mM = N2 + M1;
            }

            if(Math.abs(NR) >= 80 & res.equals("A") & Math.abs(C) < 80 & Math.abs(B) < 80) {
                nN = N2 - M2;
                mM = N2 - M1;
            }

            if(Math.abs(NR) >= 80 & res.equals("H") & Math.abs(C) < 80 & Math.abs(B) < 80) {
                nN = N2 - M2;
                mM = N2 - M1;
            }
            
            if(Math.abs(NR) >= 80 & Math.abs(C) >= 80 & res.equals("H")) {
                nN = N2 + M2;
                mM = N2 + M1;
            }
            
            if(Math.abs(NR) >= 80 & Math.abs(B) >= 80 & res.equals("H")) {
                nN = N1 + M2;
                mM = N2 + M1;
            }

            nN_txt.setText(Integer.toString(Math.abs(nN)));
            mM_txt.setText(Integer.toString(Math.abs(mM)));

            String signB = checkPosNeg(B);
            int Br =  Math.abs(B);
            int Brr;
            int Brrr = 0;
            if ((Br > 9 & Br < 1000) | (Br < -9 & Br > -1000)) {
                Brr = 0;
                while (Br > 0) {
                    Brr = Brr + Br % 10;
                    Br = Br / 10;
                }
            } else {
                Brr = Br;
            }
            if(Brr > 9) {
                while (Brr > 0) {
                    Brrr = Brrr + Brr % 10;
                    Brr = Brr / 10;
                }
            } else {
                Brrr = Brr;
            }
            if(signB.equals("Negative")) {
                Brrr = Brrr * -1;
            }

            String signx1 = checkPosNeg(x1);
            int x1r =  Math.abs(x1);
            int x1rr;
            int x1rrr = 0;
            if ((x1r > 9 & x1r < 1000) | (x1r < -9 & x1r > -1000)) {
                x1rr = 0;
                while (x1r > 0) {
                    x1rr = x1rr + x1r % 10;
                    x1r = x1r / 10;
                }
            } else {
                x1rr = x1r;
            }
            if(x1rr > 9) {
                while (x1rr > 0) {
                    x1rrr = x1rrr + x1rr % 10;
                    x1rr = x1rr / 10;
                }
            } else {
                x1rrr = x1rr;
            }
            if(signx1.equals("Negative")) {
                x1rrr = x1rrr * -1;
            }

            String signx2 = checkPosNeg(x2);
            int x2r =  Math.abs(x2);
            int x2rr;
            int x2rrr = 0;
            if ((x2r > 9 & x2r < 1000) | (x2r < -9 & x2r > -1000)) {
                x2rr = 0;
                while (x2r > 0) {
                    x2rr = x2rr + x2r % 10;
                    x2r = x2r / 10;
                }
            } else {
                x2rr = x2r;
            }
            if(x2rr > 9) {
                while (x2rr > 0) {
                    x2rrr = x2rrr + x2rr % 10;
                    x2rr = x2rr / 10;
                }
            } else {
                x2rrr = x2rr;
            }
            if(signx2.equals("Negative")) {
                x2rrr = x2rrr * -1;
            }

            String signx1x2 = checkPosNeg(x1x2);
            int x1x2r =  Math.abs(x1x2);
            int x1x2rr;
            int x1x2rrr = 0;
            if ((x1x2r > 9 & x1x2r < 1000) | (x1x2r < -9 & x1x2r > -1000)) {
                x1x2rr = 0;
                while (x1x2r > 0) {
                    x1x2rr = x1x2rr + x1x2r % 10;
                    x1x2r = x1x2r / 10;
                }
            } else {
                x1x2rr = x1x2r;
            }
            if(x1x2rr > 9) {
                while (x1x2rr > 0) {
                    x1x2rrr = x1x2rrr + x1x2rr % 10;
                    x1x2rr = x1x2rr / 10;
                }
            } else {
                x1x2rrr = x1x2rr;
            }
            if(signx1x2.equals("Negative")) {
                x1x2rrr = x1x2rrr * -1;
            }

            String signy1y2 = checkPosNeg(y1y2);
            int y1y2r =  Math.abs(y1y2);
            int y1y2rr;
            int y1y2rrr = 0;
            if ((y1y2r > 9 & y1y2r < 1000) | (y1y2r < -9 & y1y2r > -1000)) {
                y1y2rr = 0;
                while (y1y2r > 0) {
                    y1y2rr = y1y2rr + y1y2r % 10;
                    y1y2r = y1y2r / 10;
                }
            } else {
                y1y2rr = y1y2r;
            }
            if(y1y2rr > 9) {
                while (y1y2rr > 0) {
                    y1y2rrr = y1y2rrr + y1y2rr % 10;
                    y1y2rr = y1y2rr / 10;
                }
            } else {
                y1y2rrr = y1y2rr;
            }
            if(signy1y2.equals("Negative")) {
                y1y2rrr = y1y2rrr * -1;
            }

            String signy1 = checkPosNeg(y1);
            int y1r =  Math.abs(y1);
            int y1rr;
            int y1rrr = 0;
            if ((y1r > 9 & y1r < 1000) | (y1r < -9 & y1r > -1000)) {
                y1rr = 0;
                while (y1r > 0) {
                    y1rr = y1rr + y1r % 10;
                    y1r = y1r / 10;
                }
            } else {
                y1rr = y1r;
            }
            if(y1rr > 9) {
                while (y1rr > 0) {
                    y1rrr = y1rrr + y1rr % 10;
                    y1rr = y1rr / 10;
                }
            } else {
                y1rrr = y1rr;
            }
            if(signy1.equals("Negative")) {
                y1rrr = y1rrr * -1;
            }

            String signy2 = checkPosNeg(y2);
            int y2r =  Math.abs(y2);
            int y2rr;
            int y2rrr = 0;
            if ((y2r > 9 & y2r < 1000) | (y2r < -9 & y2r > -1000)) {
                y2rr = 0;
                while (y2r > 0) {
                    y2rr = y2rr + y2r % 10;
                    y2r = y2r / 10;
                }
            } else {
                y2rr = y2r;
            }
            if(y2rr > 9) {
                while (y2rr > 0) {
                    y2rrr = y2rrr + y2rr % 10;
                    y2rr = y2rr / 10;
                }
            } else {
                y2rrr = y2rr;
            }
            if(signy2.equals("Negative")) {
                y2rrr = y2rrr * -1;
            }

            String signnN = checkPosNeg(nN);
            int nNr =  Math.abs(nN);
            int nNrr;
            int nNrrr = 0;
            if ((nNr > 9 & nNr < 1000) | (nNr < -9 & nNr > -1000)) {
                nNrr = 0;
                while (nNr > 0) {
                    nNrr = nNrr + nNr % 10;
                    nNr = nNr / 10;
                }
            } else {
                nNrr = nNr;
            }
            if(nNrr > 9) {
                while (nNrr > 0) {
                    nNrrr = nNrrr + nNrr % 10;
                    nNrr = nNrr / 10;
                }
            } else {
                nNrrr = nNrr;
            }
            if(signnN.equals("Negative")) {
                nNrrr = nNrrr * -1;
            }

            String sigmMM = checkPosNeg(mM);
            int mMr =  Math.abs(mM);
            int mMrr;
            int mMrrr = 0;
            if ((mMr > 9 & mMr < 1000) | (mMr < -9 & mMr > -1000)) {
                mMrr = 0;
                while (mMr > 0) {
                    mMrr = mMrr + mMr % 10;
                    mMr = mMr / 10;
                }
            } else {
                mMrr = mMr;
            }
            if(mMrr > 9) {
                while (mMrr > 0) {
                    mMrrr = mMrrr + mMrr % 10;
                    mMrr = mMrr / 10;
                }
            } else {
                mMrrr = mMrr;
            }
            if(sigmMM.equals("Negative")) {
                mMrrr = mMrrr * -1;
            }
            
            ///

            W_txt.setText(Integer.toString(W));
            Z_txt.setText(Integer.toString(Z));
            D_txt.setText(Integer.toString(D));
            C_txt.setText(Integer.toString(C));

            String signZ = checkPosNeg(Z);
            int Zr =  Math.abs(Z);
            int Zrr;
            int Zrrr = 0;
            if ((Zr > 9 & Zr < 1000) | (Zr < -9 & Zr > -1000)) {
                Zrr = 0;
                while (Zr > 0) {
                    Zrr = Zrr + Zr % 10;
                    Zr = Zr / 10;
                }
            } else {
                Zrr = Zr;
            }

            if(Zrr > 9) {
                while (Zrr > 0) {
                    Zrrr = Zrrr + Zrr % 10;
                    Zrr = Zrr / 10;
                }
            } else {
                Zrrr = Zrr;
            }
            if(signZ.equals("Negative")) {
                Zrrr = Zrrr * -1;
            }

            String signW = checkPosNeg(W);
            int Wr =  Math.abs(W);
            int Wrr;
            int Wrrr = 0;
            if ((Wr > 9 & Wr < 1000) | (Wr < -9 & Wr > -1000)) {
                Wrr = 0;
                while (Wr > 0) {
                    Wrr = Wrr + Wr % 10;
                    Wr = Wr / 10;
                }
            } else {
                Wrr = Wr;
            }
            if(Wrr > 9) {
                while (Wrr > 0) {
                    Wrrr = Wrrr + Wrr % 10;
                    Wrr = Wrr / 10;
                }
            } else {
                Wrrr = Wrr;
            }
            if(signW.equals("Negative")) {
                Wrrr = Wrrr * -1;
            }

            String signD = checkPosNeg(D);
            int Dr =  Math.abs(D);
            int Drr;
            int Drrr = 0;
            if ((Dr > 9 & Dr < 1000) | (Dr < -9 & Dr > -1000)) {
                Drr = 0;
                while (Dr > 0) {
                    Drr = Drr + Dr % 10;
                    Dr = Dr / 10;
                }
            } else {
                Drr = Dr;
            }
            if(Drr > 9) {
                while (Drr > 0) {
                    Drrr = Drrr + Drr % 10;
                    Drr = Drr / 10;
                }
            } else {
                Drrr = Drr;
            }
            if(signD.equals("Negative")) {
                Drrr = Drrr * -1;
            }

            String signC = checkPosNeg(C);
            int Cr =  Math.abs(C);
            int Crr;
            int Crrr = 0;
            if ((Cr > 9 & Cr < 1000) | (Cr < -9 & Cr > -1000)) {
                Crr = 0;
                while (Cr > 0) {
                    Crr = Crr + Cr % 10;
                    Cr = Cr / 10;
                }
            } else {
                Crr = Cr;
            }
            if(Crr > 9) {
                while (Crr > 0) {
                    Crrr = Crrr + Crr % 10;
                    Crr = Crr / 10;
                }
            } else {
                Crrr = Crr;
            }
            if(signC.equals("Negative")) {
                Crrr = Crrr * -1;
            }

            int vv4r =  Math.abs(vv4);
            int vv4rr;
            int vv4rrr = 0;
            if ((vv4r > 9 & vv4r < 1000) | (vv4r < -9 & vv4r > -1000)) {
                vv4rr = 0;
                while (vv4r > 0) {
                    vv4rr = vv4rr + vv4r % 10;
                    vv4r = vv4r / 10;
                }
            } else {
                vv4rr = vv4r;
            }
            if(vv4rr > 9) {
                while (vv4rr > 0) {
                    vv4rrr = vv4rrr + vv4rr % 10;
                    vv4rr = vv4rr / 10;
                }
            } else {
                vv4rrr = vv4rr;
            }
            if(signvv4.equals("Negative")) {
                vv4rrr = vv4rrr * -1;
            }

            int v5r =  Math.abs(v5);
            int v5rr;
            int v5rrr = 0;
            if ((v5r > 9 & v5r < 1000) | (v5r < -9 & v5r > -1000)) {
                v5rr = 0;
                while (v5r > 0) {
                    v5rr = v5rr + v5r % 10;
                    v5r = v5r / 10;
                }
            } else {
                v5rr = v5r;
            }
            if(v5rr > 9) {
                while (v5rr > 0) {
                    v5rrr = v5rrr + v5rr % 10;
                    v5rr = v5rr / 10;
                }
            } else {
                v5rrr = v5rr;
            }
            if(signv5.equals("Negative")) {
                v5rrr = v5rrr * -1;
            }

            String signvv5 = checkPosNeg(vv5);
            int vv5r =  Math.abs(vv5);
            int vv5rr;
            int vv5rrr = 0;
            if ((vv5r > 9 & vv5r < 1000) | (vv5r < -9 & vv5r > -1000)) {
                vv5rr = 0;
                while (vv5r > 0) {
                    vv5rr = vv5rr + vv5r % 10;
                    vv5r = vv5r / 10;
                }
            } else {
                vv5rr = vv5r;
            }
            if(vv5rr > 9) {
                while (vv5rr > 0) {
                    vv5rrr = vv5rrr + vv5rr % 10;
                    vv5rr = vv5rr / 10;
                }
            } else {
                vv5rrr = vv5rr;
            }
            if(signvv5.equals("Negative")) {
                vv5rrr = vv5rrr * -1;
            }

            String signMN0 = checkPosNeg(MN0);
            int MN0r =  Math.abs(MN0);
            int MN0rr;
            int MN0rrr = 0;
            if ((MN0r > 9 & MN0r < 1000) | (MN0r < -9 & MN0r > -1000)) {
                MN0rr = 0;
                while (MN0r > 0) {
                    MN0rr = MN0rr + MN0r % 10;
                    MN0r = MN0r / 10;
                }
            } else {
                MN0rr = MN0r;
            }
            if(MN0rr > 9) {
                while (MN0rr > 0) {
                    MN0rrr = MN0rrr + MN0rr % 10;
                    MN0rr = MN0rr / 10;
                }
            } else {
                MN0rrr = MN0rr;
            }
            if(signMN0.equals("Negative")) {
                MN0rrr = MN0rrr * -1;
            }

            String signoGP = checkPosNeg(GP);
            int oGPr =  Math.abs(GP);
            int oGPrr;
            int oGPrrr = 0;
            if ((oGPr > 9 & oGPr < 1000) | (oGPr < -9 & oGPr > -1000)) {
                oGPrr = 0;
                while (oGPr > 0) {
                    oGPrr = oGPrr + oGPr % 10;
                    oGPr = oGPr / 10;
                }
            } else {
                oGPrr = oGPr;
            }
            if(oGPrr > 9) {
                while (oGPrr > 0) {
                    oGPrrr = oGPrrr + oGPrr % 10;
                    oGPrr = oGPrr / 10;
                }
            } else {
                oGPrrr = oGPrr;
            }
            if(signoGP.equals("Negative")) {
                oGPrrr = oGPrrr * -1;
            }

            String signoXY = checkPosNeg(XY);
            int oXYr =  Math.abs(XY);
            int oXYrr;
            int oXYrrr = 0;
            if ((oXYr > 9 & oXYr < 1000) | (oXYr < -9 & oXYr > -1000)) {
                oXYrr = 0;
                while (oXYr > 0) {
                    oXYrr = oXYrr + oXYr % 10;
                    oXYr = oXYr / 10;
                }
            } else {
                oXYrr = oXYr;
            }
            if(oXYrr > 9) {
                while (oXYrr > 0) {
                    oXYrrr = oXYrrr + oXYrr % 10;
                    oXYrr = oXYrr / 10;
                }
            } else {
                oXYrrr = oXYrr;
            }
            if(signoXY.equals("Negative")) {
                oXYrrr = oXYrrr * -1;
            }

            String signGP = checkPosNeg(NGP);
            int GPr =  Math.abs(NGP);
            int GPrr;
            int GPrrr = 0;
            if ((GPr > 9 & GPr < 1000) | (GPr < -9 & GPr > -1000)) {
                GPrr = 0;
                while (GPr > 0) {
                    GPrr = GPrr + GPr % 10;
                    GPr = GPr / 10;
                }
            } else {
                GPrr = GPr;
            }
            if(GPrr > 9) {
                while (GPrr > 0) {
                    GPrrr = GPrrr + GPrr % 10;
                    GPrr = GPrr / 10;
                }
            } else {
                GPrrr = GPrr;
            }
            if(signGP.equals("Negative")) {
                GPrrr = GPrrr * -1;
            }

            String signXY = checkPosNeg(NXY);
            int XYr =  Math.abs(NXY);
            int XYrr;
            int XYrrr = 0;
            if ((XYr > 9 & XYr < 1000) | (XYr < -9 & XYr > -1000)) {
                XYrr = 0;
                while (XYr > 0) {
                    XYrr = XYrr + XYr % 10;
                    XYr = XYr / 10;
                }
            } else {
                XYrr = XYr;
            }
            if(XYrr > 9) {
                while (XYrr > 0) {
                    XYrrr = XYrrr + XYrr % 10;
                    XYrr = XYrr / 10;
                }
            } else {
                XYrrr = XYrr;
            }
            if(signXY.equals("Negative")) {
                XYrrr = XYrrr * -1;
            }
            
            int CB = C + B;
            String signCB = checkPosNeg(CB);
            int CBr =  Math.abs(CB);
            int CBrr;
            int CBrrr = 0;
            if ((CBr > 9 & CBr < 1000) | (CBr < -9 & CBr > -1000)) {
                CBrr = 0;
                while (CBr > 0) {
                    CBrr = CBrr + CBr % 10;
                    CBr = CBr / 10;
                }
            } else {
                CBrr = CBr;
            }
            if(CBrr > 9) {
                while (CBrr > 0) {
                    CBrrr = CBrrr + CBrr % 10;
                    CBrr = CBrr / 10;
                }
            } else {
                CBrrr = CBrr;
            }
            if(signCB.equals("Negative")) {
                CBrrr = CBrrr * -1;
            }

            String signG = checkPosNeg(G);
            int Gr =  Math.abs(G);
            int Grr;
            int Grrr = 0;
            if ((Gr > 9 & Gr < 1000) | (Gr < -9 & Gr > -1000)) {
                Grr = 0;
                while (Gr > 0) {
                    Grr = Grr + Gr % 10;
                    Gr = Gr / 10;
                }
            } else {
                Grr = Gr;
            }
            if(Grr > 9) {
                while (Grr > 0) {
                    Grrr = Grrr + Grr % 10;
                    Grr = Grr / 10;
                }
            } else {
                Grrr = Grr;
            }
            if(signG.equals("Negative")) {
                Grrr = Grrr * -1;
            }

            String signV = checkPosNeg(V);
            int Vr =  Math.abs(V);
            int Vrr;
            int Vrrr = 0;
            if ((Vr > 9 & Vr < 1000) | (Vr < -9 & Vr > -1000)) {
                Vrr = 0;
                while (Vr > 0) {
                    Vrr = Vrr + Vr % 10;
                    Vr = Vr / 10;
                }
            } else {
                Vrr = Vr;
            }
            if(Vrr > 9) {
                while (Vrr > 0) {
                    Vrrr = Vrrr + Vrr % 10;
                    Vrr = Vrr / 10;
                }
            } else {
                Vrrr = Vrr;
            }
            if(signV.equals("Negative")) {
                Vrrr = Vrrr * -1;
            }

            String signGt = checkPosNeg(Gt);
            int Gtr =  Math.abs(Gt);
            int Gtrr;
            int Gtrrr = 0;
            if ((Gtr > 9 & Gtr < 1000) | (Gtr < -9 & Gtr > -1000)) {
                Gtrr = 0;
                while (Gtr > 0) {
                    Gtrr = Gtrr + Gtr % 10;
                    Gtr = Gtr / 10;
                }
            } else {
                Gtrr = Gtr;
            }
            if(Gtrr > 9) {
                while (Gtrr > 0) {
                    Gtrrr = Gtrrr + Gtrr % 10;
                    Gtrr = Gtrr / 10;
                }
            } else {
                Gtrrr = Gtrr;
            }
            if(signGt.equals("Negative")) {
                Gtrrr = Gtrrr * -1;
            }

            String signVt = checkPosNeg(Vt);
            int Vtr =  Math.abs(Vt);
            int Vtrr;
            int Vtrrr = 0;
            if ((Vtr > 9 & Vtr < 1000) | (Vtr < -9 & Vtr > -1000)) {
                Vtrr = 0;
                while (Vtr > 0) {
                    Vtrr = Vtrr + Vtr % 10;
                    Vtr = Vtr / 10;
                }
            } else {
                Vtrr = Vtr;
            }
            if(Vtrr > 9) {
                while (Vtrr > 0) {
                    Vtrrr = Vtrrr + Vtrr % 10;
                    Vtrr = Vtrr / 10;
                }
            } else {
                Vtrrr = Vtrr;
            }
            if(signVt.equals("Negative")) {
                Vtrrr = Vtrrr * -1;
            }

            String signXB = checkPosNeg(NXB);
            int XBr =  Math.abs(NXB);
            int XBrr;
            int XBrrr = 0;
            if ((XBr > 9 & XBr < 1000) | (XBr < -9 & XBr > -1000)) {
                XBrr = 0;
                while (XBr > 0) {
                    XBrr = XBrr + XBr % 10;
                    XBr = XBr / 10;
                }
            } else {
                XBrr = XBr;
            }
            if(XBrr > 9) {
                while (XBrr > 0) {
                    XBrrr = XBrrr + XBrr % 10;
                    XBrr = XBrr / 10;
                }
            } else {
                XBrrr = XBrr;
            }
            if(signXB.equals("Negative")) {
                XBrrr = XBrrr * -1;
            }

            String signoXB = checkPosNeg(XB);
            int oXBr =  Math.abs(XB);
            int oXBrr;
            int oXBrrr = 0;
            if ((oXBr > 9 & oXBr < 1000) | (oXBr < -9 & oXBr > -1000)) {
                oXBrr = 0;
                while (oXBr > 0) {
                    oXBrr = oXBrr + oXBr % 10;
                    oXBr = oXBr / 10;
                }
            } else {
                oXBrr = oXBr;
            }
            if(oXBrr > 9) {
                while (oXBrr > 0) {
                    oXBrrr = oXBrrr + oXBrr % 10;
                    oXBrr = oXBrr / 10;
                }
            } else {
                oXBrrr = oXBrr;
            }
            if(signoXB.equals("Negative")) {
                oXBrrr = oXBrrr * -1;
            }

            String signYM = checkPosNeg(NYM);
            int YMr =  Math.abs(NYM);
            int YMrr;
            int YMrrr = 0;
            if ((YMr > 9 & YMr < 1000) | (YMr < -9 & YMr > -1000)) {
                YMrr = 0;
                while (YMr > 0) {
                    YMrr = YMrr + YMr % 10;
                    YMr = YMr / 10;
                }
            } else {
                YMrr = YMr;
            }
            if(YMrr > 9) {
                while (YMrr > 0) {
                    YMrrr = YMrrr + YMrr % 10;
                    YMrr = YMrr / 10;
                }
            } else {
                YMrrr = YMrr;
            }
            if(signYM.equals("Negative")) {
                YMrrr = YMrrr * -1;
            }

            String signOX = checkPosNeg(OX);
            int OXr =  Math.abs(OX);
            int OXrr;
            int OXrrr = 0;
            if ((OXr > 9 & OXr < 1000) | (OXr < -9 & OXr > -1000)) {
                OXrr = 0;
                while (OXr > 0) {
                    OXrr = OXrr + OXr % 10;
                    OXr = OXr / 10;
                }
            } else {
                OXrr = OXr;
            }
            if(OXrr > 9) {
                while (OXrr > 0) {
                    OXrrr = OXrrr + OXrr % 10;
                    OXrr = OXrr / 10;
                }
            } else {
                OXrrr = OXrr;
            }
            if(signOX.equals("Negative")) {
                OXrrr = OXrrr * -1;
            }

            String signOY = checkPosNeg(OY);
            int OYr =  Math.abs(OY);
            int OYrr;
            int OYrrr = 0;
            if ((OYr > 9 & OYr < 1000) | (OYr < -9 & OYr > -1000)) {
                OYrr = 0;
                while (OYr > 0) {
                    OYrr = OYrr + OYr % 10;
                    OYr = OYr / 10;
                }
            } else {
                OYrr = OYr;
            }
            if(OYrr > 9) {
                while (OYrr > 0) {
                    OYrrr = OYrrr + OYrr % 10;
                    OYrr = OYrr / 10;
                }
            } else {
                OYrrr = OYrr;
            }
            if(signOY.equals("Negative")) {
                OYrrr = OYrrr * -1;
            }

            String signGV = checkPosNeg(GV);
            int GVr =  Math.abs(GV);
            int GVrr;
            int GVrrr = 0;
            if ((GVr > 9 & GVr < 1000) | (GVr < -9 & GVr > -1000)) {
                GVrr = 0;
                while (GVr > 0) {
                    GVrr = GVrr + GVr % 10;
                    GVr = GVr / 10;
                }
            } else {
                GVrr = GVr;
            }
            if(GVrr > 9) {
                while (GVrr > 0) {
                    GVrrr = GVrrr + GVrr % 10;
                    GVrr = GVrr / 10;
                }
            } else {
                GVrrr = GVrr;
            }
            if(signGV.equals("Negative")) {
                GVrrr = GVrrr * -1;
            }

            String signGVT = checkPosNeg(GVT);
            int GVTr =  Math.abs(GVT);
            int GVTrr;
            int GVTrrr = 0;
            if ((GVTr > 9 & GVTr < 1000) | (GVTr < -9 & GVTr > -1000)) {
                GVTrr = 0;
                while (GVTr > 0) {
                    GVTrr = GVTrr + GVTr % 10;
                    GVTr = GVTr / 10;
                }
            } else {
                GVTrr = GVTr;
            }
            if(GVTrr > 9) {
                while (GVTrr > 0) {
                    GVTrrr = GVTrrr + GVTrr % 10;
                    GVTrr = GVTrr / 10;
                }
            } else {
                GVTrrr = GVTrr;
            }
            if(signGVT.equals("Negative")) {
                GVTrrr = GVTrrr * -1;
            }

            String signGVTOX = checkPosNeg(GVTOX);
            int GVTOXr =  Math.abs(GVTOX);
            int GVTOXrr;
            int GVTOXrrr = 0;
            if ((GVTOXr > 9 & GVTOXr < 1000) | (GVTOXr < -9 & GVTOXr > -1000)) {
                GVTOXrr = 0;
                while (GVTOXr > 0) {
                    GVTOXrr = GVTOXrr + GVTOXr % 10;
                    GVTOXr = GVTOXr / 10;
                }
            } else {
                GVTOXrr = GVTOXr;
            }
            if(GVTOXrr > 9) {
                while (GVTOXrr > 0) {
                    GVTOXrrr = GVTOXrrr + GVTOXrr % 10;
                    GVTOXrr = GVTOXrr / 10;
                }
            } else {
                GVTOXrrr = GVTOXrr;
            }
            if(signGVTOX.equals("Negative")) {
                GVTOXrrr = GVTOXrrr * -1;
            }

            String signGVOY = checkPosNeg(GVOY);
            int GVOYr =  Math.abs(GVOY);
            int GVOYrr;
            int GVOYrrr = 0;
            if ((GVOYr > 9 & GVOYr < 1000) | (GVOYr < -9 & GVOYr > -1000)) {
                GVOYrr = 0;
                while (GVOYr > 0) {
                    GVOYrr = GVOYrr + GVOYr % 10;
                    GVOYr = GVOYr / 10;
                }
            } else {
                GVOYrr = GVOYr;
            }
            if(GVOYrr > 9) {
                while (GVOYrr > 0) {
                    GVOYrrr = GVOYrrr + GVOYrr % 10;
                    GVOYrr = GVOYrr / 10;
                }
            } else {
                GVOYrrr = GVOYrr;
            }
            if(signGVOY.equals("Negative")) {
                GVOYrrr = GVOYrrr * -1;
            }

            String signoYM = checkPosNeg(YM);
            int oYMr =  Math.abs(YM);
            int oYMrr;
            int oYMrrr = 0;
            if ((oYMr > 9 & oYMr < 1000) | (oYMr < -9 & oYMr > -1000)) {
                oYMrr = 0;
                while (oYMr > 0) {
                    oYMrr = oYMrr + oYMr % 10;
                    oYMr = oYMr / 10;
                }
            } else {
                oYMrr = oYMr;
            }
            if(oYMrr > 9) {
                while (oYMrr > 0) {
                    oYMrrr = oYMrrr + oYMrr % 10;
                    oYMrr = oYMrr / 10;
                }
            } else {
                oYMrrr = oYMrr;
            }
            if(signoYM.equals("Negative")) {
                oYMrrr = oYMrrr * -1;
            }
            
            int sumYMBM2;
            sumYMBM2 = NYM + NXB;

            String signsumYMBM2 = checkPosNeg(sumYMBM2);
            int sumYMBM2r = Math.abs(sumYMBM2);
            int sumYMBM2rr;
            int sumYMBM2rrr = 0;
            if ((sumYMBM2r > 9 & sumYMBM2r < 1000) | (sumYMBM2r < -9 & sumYMBM2r > -1000)) {
                sumYMBM2rr = 0;
                while (sumYMBM2r > 0) {
                    sumYMBM2rr = sumYMBM2rr + sumYMBM2r % 10;
                    sumYMBM2r = sumYMBM2r / 10;
                }
            } else {
                sumYMBM2rr = sumYMBM2r;
            }
            if(sumYMBM2rr > 9) {
                while (sumYMBM2rr > 0) {
                    sumYMBM2rrr = sumYMBM2rrr + sumYMBM2rr % 10;
                    sumYMBM2rr = sumYMBM2rr / 10;
                }
            } else {
                sumYMBM2rrr = sumYMBM2rr;
            }
            if(signsumYMBM2.equals("Negative")) {
                sumYMBM2rrr = sumYMBM2rrr * -1;
            }
            
            int sumoYMBM2;
            sumoYMBM2 = YM + BM2;

            String signsumoYMBM2 = checkPosNeg(sumoYMBM2);
            int sumoYMBM2r = Math.abs(sumoYMBM2);
            int sumoYMBM2rr;
            int sumoYMBM2rrr = 0;
            if ((sumoYMBM2r > 9 & sumoYMBM2r < 1000) | (sumoYMBM2r < -9 & sumoYMBM2r > -1000)) {
                sumoYMBM2rr = 0;
                while (sumoYMBM2r > 0) {
                    sumoYMBM2rr = sumoYMBM2rr + sumoYMBM2r % 10;
                    sumoYMBM2r = sumoYMBM2r / 10;
                }
            } else {
                sumoYMBM2rr = sumoYMBM2r;
            }
            if(sumoYMBM2rr > 9) {
                while (sumoYMBM2rr > 0) {
                    sumoYMBM2rrr = sumoYMBM2rrr + sumoYMBM2rr % 10;
                    sumoYMBM2rr = sumoYMBM2rr / 10;
                }
            } else {
                sumoYMBM2rrr = sumoYMBM2rr;
            }
            if(signsumoYMBM2.equals("Negative")) {
                sumoYMBM2rrr = sumoYMBM2rrr * -1;
            }

            int sumoXYXY;
            sumoXYXY = XY + NXY;

            String signsumoXYXY = checkPosNeg(sumoXYXY);
            int sumoXYXYr = Math.abs(sumoXYXY);
            int sumoXYXYrr;
            int sumoXYXYrrr = 0;
            if ((sumoXYXYr > 9 & sumoXYXYr < 1000) | (sumoXYXYr < -9 & sumoXYXYr > -1000)) {
                sumoXYXYrr = 0;
                while (sumoXYXYr > 0) {
                    sumoXYXYrr = sumoXYXYrr + sumoXYXYr % 10;
                    sumoXYXYr = sumoXYXYr / 10;
                }
            } else {
                sumoXYXYrr = sumoXYXYr;
            }
            if(sumoXYXYrr > 9) {
                while (sumoXYXYrr > 0) {
                    sumoXYXYrrr = sumoXYXYrrr + sumoXYXYrr % 10;
                    sumoXYXYrr = sumoXYXYrr / 10;
                }
            } else {
                sumoXYXYrrr = sumoXYXYrr;
            }
            if(signsumoXYXY.equals("Negative")) {
                sumoXYXYrrr = sumoXYXYrrr * -1;
            }

            int summXYXY;
            summXYXY = XY - NXY;

            String signsummXYXY = checkPosNeg(summXYXY);
            int summXYXYr = Math.abs(summXYXY);
            int summXYXYrr;
            int summXYXYrrr = 0;
            if ((summXYXYr > 9 & summXYXYr < 1000) | (summXYXYr < -9 & summXYXYr > -1000)) {
                summXYXYrr = 0;
                while (summXYXYr > 0) {
                    summXYXYrr = summXYXYrr + summXYXYr % 10;
                    summXYXYr = summXYXYr / 10;
                }
            } else {
                summXYXYrr = summXYXYr;
            }
            if(summXYXYrr > 9) {
                while (summXYXYrr > 0) {
                    summXYXYrrr = summXYXYrrr + summXYXYrr % 10;
                    summXYXYrr = summXYXYrr / 10;
                }
            } else {
                summXYXYrrr = summXYXYrr;
            }
            if(signsummXYXY.equals("Negative")) {
                summXYXYrrr = summXYXYrrr * -1;
            }

            int sumaGPGP;
            sumaGPGP = GP + NGP;

            String signsumaGPGP = checkPosNeg(sumaGPGP);
            int sumaGPGPr = Math.abs(sumaGPGP);
            int sumaGPGPrr;
            int sumaGPGPrrr = 0;
            if ((sumaGPGPr > 9 & sumaGPGPr < 1000) | (sumaGPGPr < -9 & sumaGPGPr > -1000)) {
                sumaGPGPrr = 0;
                while (sumaGPGPr > 0) {
                    sumaGPGPrr = sumaGPGPrr + sumaGPGPr % 10;
                    sumaGPGPr = sumaGPGPr / 10;
                }
            } else {
                sumaGPGPrr = sumaGPGPr;
            }
            if(sumaGPGPrr > 9) {
                while (sumaGPGPrr > 0) {
                    sumaGPGPrrr = sumaGPGPrrr + sumaGPGPrr % 10;
                    sumaGPGPrr = sumaGPGPrr / 10;
                }
            } else {
                sumaGPGPrrr = sumaGPGPrr;
            }
            if(signsumaGPGP.equals("Negative")) {
                sumaGPGPrrr = sumaGPGPrrr * -1;
            }

            int summGPGP;
            summGPGP = GP - NGP;

            String signsummGPGP = checkPosNeg(summGPGP);
            int summGPGPr = Math.abs(summGPGP);
            int summGPGPrr;
            int summGPGPrrr = 0;
            if ((summGPGPr > 9 & summGPGPr < 1000) | (summGPGPr < -9 & summGPGPr > -1000)) {
                summGPGPrr = 0;
                while (summGPGPr > 0) {
                    summGPGPrr = summGPGPrr + summGPGPr % 10;
                    summGPGPr = summGPGPr / 10;
                }
            } else {
                summGPGPrr = summGPGPr;
            }
            if(summGPGPrr > 9) {
                while (summGPGPrr > 0) {
                    summGPGPrrr = summGPGPrrr + summGPGPrr % 10;
                    summGPGPrr = summGPGPrr / 10;
                }
            } else {
                summGPGPrrr = summGPGPrr;
            }
            if(signsummGPGP.equals("Negative")) {
                summGPGPrrr = summGPGPrrr * -1;
            }

            int summXYGP;
            summXYGP = NXY - NGP;

            String signsummXYGP = checkPosNeg(summXYGP);
            int summXYGPr = Math.abs(summXYGP);
            int summXYGPrr;
            int summXYGPrrr = 0;
            if ((summXYGPr > 9 & summXYGPr < 1000) | (summXYGPr < -9 & summXYGPr > -1000)) {
                summXYGPrr = 0;
                while (summXYGPr > 0) {
                    summXYGPrr = summXYGPrr + summXYGPr % 10;
                    summXYGPr = summXYGPr / 10;
                }
            } else {
                summXYGPrr = summXYGPr;
            }
            if(summXYGPrr > 9) {
                while (summXYGPrr > 0) {
                    summXYGPrrr = summXYGPrrr + summXYGPrr % 10;
                    summXYGPrr = summXYGPrr / 10;
                }
            } else {
                summXYGPrrr = summXYGPrr;
            }
            if(signsummXYGP.equals("Negative")) {
                summXYGPrrr = summXYGPrrr * -1;
            }

            int sumBMBM;
            sumBMBM = BM1 + BM2;

            String signsumBMBM = checkPosNeg(sumBMBM);
            int sumBMBMr = Math.abs(sumBMBM);
            int sumBMBMrr;
            int sumBMBMrrr = 0;
            if ((sumBMBMr > 9 & sumBMBMr < 1000) | (sumBMBMr < -9 & sumBMBMr > -1000)) {
                sumBMBMrr = 0;
                while (sumBMBMr > 0) {
                    sumBMBMrr = sumBMBMrr + sumBMBMr % 10;
                    sumBMBMr = sumBMBMr / 10;
                }
            } else {
                sumBMBMrr = sumBMBMr;
            }
            if(sumBMBMrr > 9) {
                while (sumBMBMrr > 0) {
                    sumBMBMrrr = sumBMBMrrr + sumBMBMrr % 10;
                    sumBMBMrr = sumBMBMrr / 10;
                }
            } else {
                sumBMBMrrr = sumBMBMrr;
            }
            if(signsumBMBM.equals("Negative")) {
                sumBMBMrrr = sumBMBMrrr * -1;
            }

            int sumMBMBM;
            sumMBMBM = BM1 - BM2;

            String signsumMBMBM = checkPosNeg(sumMBMBM);
            int sumMBMBMr = Math.abs(sumMBMBM);
            int sumMBMBMrr;
            int sumMBMBMrrr = 0;
            if ((sumMBMBMr > 9 & sumMBMBMr < 1000) | (sumMBMBMr < -9 & sumMBMBMr > -1000)) {
                sumMBMBMrr = 0;
                while (sumMBMBMr > 0) {
                    sumMBMBMrr = sumMBMBMrr + sumMBMBMr % 10;
                    sumMBMBMr = sumMBMBMr / 10;
                }
            } else {
                sumMBMBMrr = sumMBMBMr;
            }
            if(sumMBMBMrr > 9) {
                while (sumMBMBMrr > 0) {
                    sumMBMBMrrr = sumMBMBMrrr + sumMBMBMrr % 10;
                    sumMBMBMrr = sumMBMBMrr / 10;
                }
            } else {
                sumMBMBMrrr = sumMBMBMrr;
            }
            if(signsumMBMBM.equals("Negative")) {
                sumMBMBMrrr = sumMBMBMrrr * -1;
            }

            int sumoXYGP;
            sumoXYGP = NXY + NGP;

            String signsumoXYGP = checkPosNeg(sumoXYGP);
            int sumoXYGPr = Math.abs(sumoXYGP);
            int sumoXYGPrr;
            int sumoXYGPrrr = 0;
            if ((sumoXYGPr > 9 & sumoXYGPr < 1000) | (sumoXYGPr < -9 & sumoXYGPr > -1000)) {
                sumoXYGPrr = 0;
                while (sumoXYGPr > 0) {
                    sumoXYGPrr = sumoXYGPrr + sumoXYGPr % 10;
                    sumoXYGPr = sumoXYGPr / 10;
                }
            } else {
                sumoXYGPrr = sumoXYGPr;
            }
            if(sumoXYGPrr > 9) {
                while (sumoXYGPrr > 0) {
                    sumoXYGPrrr = sumoXYGPrrr + sumoXYGPrr % 10;
                    sumoXYGPrr = sumoXYGPrr / 10;
                }
            } else {
                sumoXYGPrrr = sumoXYGPrr;
            }
            if(signsumoXYGP.equals("Negative")) {
                sumoXYGPrrr = sumoXYGPrrr * -1;
            }

            int sumOXYGP;
            sumOXYGP = XY + GP;

            String signsumOXYGP = checkPosNeg(sumOXYGP);
            int sumOXYGPr = Math.abs(sumOXYGP);
            int sumOXYGPrr;
            int sumOXYGPrrr = 0;
            if ((sumOXYGPr > 9 & sumOXYGPr < 1000) | (sumOXYGPr < -9 & sumOXYGPr > -1000)) {
                sumOXYGPrr = 0;
                while (sumOXYGPr > 0) {
                    sumOXYGPrr = sumOXYGPrr + sumOXYGPr % 10;
                    sumOXYGPr = sumOXYGPr / 10;
                }
            } else {
                sumOXYGPrr = sumOXYGPr;
            }
            if(sumOXYGPrr > 9) {
                while (sumOXYGPrr > 0) {
                    sumOXYGPrrr = sumOXYGPrrr + sumOXYGPrr % 10;
                    sumOXYGPrr = sumOXYGPrr / 10;
                }
            } else {
                sumOXYGPrrr = sumOXYGPrr;
            }
            if(signsumOXYGP.equals("Negative")) {
                sumOXYGPrrr = sumOXYGPrrr * -1;
            }

            int summOXYGP;
            summOXYGP = XY - GP;

            String signsummOXYGP = checkPosNeg(summOXYGP);
            int summOXYGPr = Math.abs(summOXYGP);
            int summOXYGPrr;
            int summOXYGPrrr = 0;
            if ((summOXYGPr > 9 & summOXYGPr < 1000) | (summOXYGPr < -9 & summOXYGPr > -1000)) {
                summOXYGPrr = 0;
                while (summOXYGPr > 0) {
                    summOXYGPrr = summOXYGPrr + summOXYGPr % 10;
                    summOXYGPr = summOXYGPr / 10;
                }
            } else {
                summOXYGPrr = summOXYGPr;
            }
            if(summOXYGPrr > 9) {
                while (summOXYGPrr > 0) {
                    summOXYGPrrr = summOXYGPrrr + summOXYGPrr % 10;
                    summOXYGPrr = summOXYGPrr / 10;
                }
            } else {
                summOXYGPrrr = summOXYGPrr;
            }
            if(signsummOXYGP.equals("Negative")) {
                summOXYGPrrr = summOXYGPrrr * -1;
            }

            int sumSDAD;
            sumSDAD = sDiffi + aDiffi;

            String signsumSDAD = checkPosNeg(sumSDAD);
            int sumSDADr = Math.abs(sumSDAD);
            int sumSDADrr;
            int sumSDADrrr = 0;
            if ((sumSDADr > 9 & sumSDADr < 1000) | (sumSDADr < -9 & sumSDADr > -1000)) {
                sumSDADrr = 0;
                while (sumSDADr > 0) {
                    sumSDADrr = sumSDADrr + sumSDADr % 10;
                    sumSDADr = sumSDADr / 10;
                }
            } else {
                sumSDADrr = sumSDADr;
            }
            if(sumSDADrr > 9) {
                while (sumSDADrr > 0) {
                    sumSDADrrr = sumSDADrrr + sumSDADrr % 10;
                    sumSDADrr = sumSDADrr / 10;
                }
            } else {
                sumSDADrrr = sumSDADrr;
            }
            if(signsumSDAD.equals("Negative")) {
                sumSDADrrr = sumSDADrrr * -1;
            }

            int sumGtVt;
            sumGtVt = Gt + Vt;

            String signsumGtVt = checkPosNeg(sumGtVt);
            int sumGtVtr = Math.abs(sumGtVt);
            int sumGtVtrr;
            int sumGtVtrrr = 0;
            if ((sumGtVtr > 9 & sumGtVtr < 1000) | (sumGtVtr < -9 & sumGtVtr > -1000)) {
                sumGtVtrr = 0;
                while (sumGtVtr > 0) {
                    sumGtVtrr = sumGtVtrr + sumGtVtr % 10;
                    sumGtVtr = sumGtVtr / 10;
                }
            } else {
                sumGtVtrr = sumGtVtr;
            }
            if(sumGtVtrr > 9) {
                while (sumGtVtrr > 0) {
                    sumGtVtrrr = sumGtVtrrr + sumGtVtrr % 10;
                    sumGtVtrr = sumGtVtrr / 10;
                }
            } else {
                sumGtVtrrr = sumGtVtrr;
            }
            if(signsumGtVt.equals("Negative")) {
                sumGtVtrrr = sumGtVtrrr * -1;
            }

            int summGtVt;
            summGtVt = Gt - Vt;

            String signsummGtVt = checkPosNeg(summGtVt);
            int summGtVtr = Math.abs(summGtVt);
            int summGtVtrr;
            int summGtVtrrr = 0;
            if ((summGtVtr > 9 & summGtVtr < 1000) | (summGtVtr < -9 & summGtVtr > -1000)) {
                summGtVtrr = 0;
                while (summGtVtr > 0) {
                    summGtVtrr = summGtVtrr + summGtVtr % 10;
                    summGtVtr = summGtVtr / 10;
                }
            } else {
                summGtVtrr = summGtVtr;
            }
            if(summGtVtrr > 9) {
                while (summGtVtrr > 0) {
                    summGtVtrrr = summGtVtrrr + summGtVtrr % 10;
                    summGtVtrr = summGtVtrr / 10;
                }
            } else {
                summGtVtrrr = summGtVtrr;
            }
            if(signsummGtVt.equals("Negative")) {
                summGtVtrrr = summGtVtrrr * -1;
            }

            int summGV;
            summGV = G - V;

            String signsummGV = checkPosNeg(summGV);
            int summGVr = Math.abs(summGV);
            int summGVrr;
            int summGVrrr = 0;
            if ((summGVr > 9 & summGVr < 1000) | (summGVr < -9 & summGVr > -1000)) {
                summGVrr = 0;
                while (summGVr > 0) {
                    summGVrr = summGVrr + summGVr % 10;
                    summGVr = summGVr / 10;
                }
            } else {
                summGVrr = summGVr;
            }
            if(summGVrr > 9) {
                while (summGVrr > 0) {
                    summGVrrr = summGVrrr + summGVrr % 10;
                    summGVrr = summGVrr / 10;
                }
            } else {
                summGVrrr = summGVrr;
            }
            if(signsummGV.equals("Negative")) {
                summGVrrr = summGVrrr * -1;
            }

            int sumGV;
            sumGV = G + V;

            String signsumGV = checkPosNeg(sumGV);
            int sumGVr = Math.abs(sumGV);
            int sumGVrr;
            int sumGVrrr = 0;
            if ((sumGVr > 9 & sumGVr < 1000) | (sumGVr < -9 & sumGVr > -1000)) {
                sumGVrr = 0;
                while (sumGVr > 0) {
                    sumGVrr = sumGVrr + sumGVr % 10;
                    sumGVr = sumGVr / 10;
                }
            } else {
                sumGVrr = sumGVr;
            }
            if(sumGVrr > 9) {
                while (sumGVrr > 0) {
                    sumGVrrr = sumGVrrr + sumGVrr % 10;
                    sumGVrr = sumGVrr / 10;
                }
            } else {
                sumGVrrr = sumGVrr;
            }
            if(signsumGV.equals("Negative")) {
                sumGVrrr = sumGVrrr * -1;
            }

            String signsumC = checkPosNeg(C);
            int sumCr = Math.abs(C);
            int sumCrr;
            int sumCrrr = 0;
            if ((sumCr > 9 & sumCr < 1000) | (sumCr < -9 & sumCr > -1000)) {
                sumCrr = 0;
                while (sumCr > 0) {
                    sumCrr = sumCrr + sumCr % 10;
                    sumCr = sumCr / 10;
                }
            } else {
                sumCrr = sumCr;
            }
            if(sumCrr > 9) {
                while (sumCrr > 0) {
                    sumCrrr = sumCrrr + sumCrr % 10;
                    sumCrr = sumCrr / 10;
                }
            } else {
                sumCrrr = sumCrr;
            }
            if(signsumC.equals("Negative")) {
                sumCrrr = sumCrrr * -1;
            }

            String DN = null;
            String SN = null;

            int Bd1, Bd2, Cd1, Cd2, Dd1, Dd2;
            Bd1 = (Math.abs(Math.abs(B) - 1));
            Bd2 = (Math.abs(Math.abs(B) - 2));
            Cd1 = (Math.abs(Math.abs(C) - 1));
            Cd2 = (Math.abs(Math.abs(C) - 2));
            Dd1 = (Math.abs(Math.abs(D) - 1));
            Dd2 = (Math.abs(Math.abs(D) - 2));

            int Bd1r, Bd2r, Cd1r, Cd2r, Dd1r, Dd2r;
            Bd1r = (Math.abs(Math.abs(Brrr) - 1));
            Bd2r = (Math.abs(Math.abs(Brrr) - 2));
            Cd1r = (Math.abs(Math.abs(Crrr) - 1));
            Cd2r = (Math.abs(Math.abs(Crrr) - 2));
            Dd1r = (Math.abs(Math.abs(Drrr) - 1));
            Dd2r = (Math.abs(Math.abs(Drrr) - 2));

            Bd1_txt.setText(Integer.toString(Bd1));
            Bd2_txt.setText(Integer.toString(Bd2));
            Cd1_txt.setText(Integer.toString(Cd1));
            Cd2_txt.setText(Integer.toString(Cd2));
            Dd1_txt.setText(Integer.toString(Dd1));
            Dd2_txt.setText(Integer.toString(Dd2));

            Bd1r_txt.setText(Integer.toString(Bd1r));
            Bd2r_txt.setText(Integer.toString(Bd2r));
            Cd1r_txt.setText(Integer.toString(Cd1r));
            Cd2r_txt.setText(Integer.toString(Cd2r));
            Dd1r_txt.setText(Integer.toString(Dd1r));
            Dd2r_txt.setText(Integer.toString(Dd2r));

            //
            /*
            if(M0 > N0) {
                ds_res_txt2.setText("H");
                xStart = "H";
            }

            if(M0 < N0) {
                ds_res_txt2.setText("A");
                xStart = "A";
            }

            if(N0 == M0) {
                ds_res_txt2.setText("VV");
                ds_res_txt2.setTextColor(Color.WHITE);
                xStart = "VV";
            }

             */

            if(x1x2 > y1y2) {
                xStart = "H";
                ds_res_txt2.setText("H");
            }

            if(x1x2 < y1y2) {
                xStart = "A";
                ds_res_txt2.setText("A");
            }

            if(x1x2 == y1y2 & (x1x2 > 0)) {
                xStart = "H";
                ds_res_txt2.setText("H");
            }

            if(x1x2 == y1y2 & x1x2 < 0) {
                xStart = "A";
                ds_res_txt2.setText("A");
            }

            /*
            if(XY > GP) {
                xStart2 = "H";
                ds_res_txt.setText("H");
            }

            if(XY < GP) {
                xStart2 = "A";
                ds_res_txt.setText("A");
            }

            if(XY == GP) {
                xStart2 = "A";
                ds_res_txt.setText("A");
            }

             */

            //

            if(C == B & C == 0) {
                marker_txt.setVisibility(View.VISIBLE);
            }

            if( D == BL & D == 0 ) {
                marker3_txt.setVisibility(View.VISIBLE);
            }

            if(gdH == gdA) {
                marker3_txt.setVisibility(View.VISIBLE);
            }

            if((C == B & C == 0) & (vv5 == R2 & lastDigit(vv5) == 0)) {
                marker2_txt.setVisibility(View.VISIBLE);
            }

            if(vv4 + vv5 == 0) {
                marker4_txt.setText("++");
                marker4_txt.setVisibility(View.VISIBLE);
            }

            int cc = 0;

            if(x2 + y2 == 0) {
                cc++;
                Log.d("HA", "x2+y2=0");
            }

            if(lastDigit(x1) == lastDigit(y1) & x1 != y1 & x1 > 0 & y1 > 0) {
                cc++;
                Log.d("HA", "x1==y1");
            }
            if(lastDigit(x1) == lastDigit(y1) & x1 != y1 & x1 < 0 & y1 < 0) {
                cc++;
                Log.d("HA", "x1==y1");
            }

            if(lastDigit(x2) == lastDigit(y2) & x2 != y2 & x2 > 0 & y2 > 0) {
                cc++;
                Log.d("HA", "x2==y2");
            }
            if(lastDigit(x2) == lastDigit(y2) & x2 != y2 & x2 < 0 & y2 < 0) {
                cc++;
                Log.d("HA", "x2==y2");
            }

            if(GV+GVT == 0 & (C != 0 & B != 0)) {
                cc++;
                Log.d("HA", "GV+GVT=0");
            }
            if(GV+GVT == 0 & (C != 0 & B == 0)) {
                cc++;
                Log.d("HA", "GV+GVT=0");
            }
            if(GV+GVT == 0 & (C == 0 & B != 0)) {
                cc++;
                Log.d("HA", "GV+GVT=0");
            }

            if(x1-x2==0 & (C != 0 & B != 0)) {
                cc++;
                Log.d("HA", "x1-x2=0");
            }
            if(x1-x2==0 & (C != 0 & B == 0)) {
                cc++;
                Log.d("HA", "x1-x2=0");
            }
            if(x1-x2==0 & (C == 0 & B != 0)) {
                cc++;
                Log.d("HA", "x1-x2=0");
            }

            if(x1+x2==0 & (C != 0 & B != 0)) {
                cc++;
                Log.d("HA", "x1+x2=0");
            }
            if(x1+x2==0 & (C != 0 & B == 0)) {
                cc++;
                Log.d("HA", "x1+x2=0");
            }
            if(x1+x2==0 & (C == 0 & B != 0)) {
                cc++;
                Log.d("HA", "x1+x2=0");
            }

            if(lastDigit(x1) == lastDigit(x2) & (C == B & C == 0)) {
                cc++;
                Log.d("HA", "x1==x2");
            }

            if(x1 < -100 & (C != 0 & B != 0)) {
                cc++;
                Log.d("HA", "x1<-100");
            }
            if(x1 < -100 & (C != 0 & B == 0)) {
                cc++;
                Log.d("HA", "x1<-100");
            }
            if(x1 < -100 & (C == 0 & B != 0)) {
                cc++;
                Log.d("HA", "x1<-100");
            }

            if(x1x2+R2==y1y2+R1 & (C != 0 & B != 0)) {
                cc++;
                Log.d("HA", "xx+R2=yy+R1=0");
            }
            if(x1x2+R2==y1y2+R1 & (C != 0 & B == 0)) {
                cc++;
                Log.d("HA", "xx+R2=yy+R1=0");
            }
            if(x1x2+R2==y1y2+R1 & (C == 0 & B != 0)) {
                cc++;
                Log.d("HA", "xx+R2=yy+R1=0");
            }

            if(GV+GVT==0) {} else {
                if (lastDigit(x1) == lastDigit(y2) & x1 > 0 & y2 > 0 & lastDigit(x2) == lastDigit(y1) & x2 > 0 & y1 > 0 & (C != 0 & B != 0)) {
                    cc++;
                    Log.d("HA", "x1==y2");
                }
                if (lastDigit(x1) == lastDigit(y2) & x1 > 0 & y2 > 0 & lastDigit(x2) == lastDigit(y1) & x2 > 0 & y1 > 0 & (C != 0 & B == 0)) {
                    cc++;
                    Log.d("HA", "x1==y2");
                }
                if (lastDigit(x1) == lastDigit(y2) & x1 > 0 & y2 > 0 & lastDigit(x2) == lastDigit(y1) & x2 > 0 & y1 > 0 & (C == 0 & B != 0)) {
                    cc++;
                    Log.d("HA", "x1==y2");
                }

                if (lastDigit(x1) == lastDigit(y2) & x1 < 0 & y2 < 0 & lastDigit(x2) == lastDigit(y1) & x2 < 0 & y1 < 0 & (C != 0 & B != 0)) {
                    cc++;
                    Log.d("HA", "x1==y2");
                }
                if (lastDigit(x1) == lastDigit(y2) & x1 < 0 & y2 < 0 & lastDigit(x2) == lastDigit(y1) & x2 < 0 & y1 < 0 & (C != 0 & B == 0)) {
                    cc++;
                    Log.d("HA", "x1==y2");
                }
                if (lastDigit(x1) == lastDigit(y2) & x1 < 0 & y2 < 0 & lastDigit(x2) == lastDigit(y1) & x2 < 0 & y1 < 0 & (C == 0 & B != 0)) {
                    cc++;
                    Log.d("HA", "x1==y2");
                }
            }

            if(M0 == 0) {} else {
                if(MN0 == 0) {} else {
                    if (C == B & C == N0 & BM1 > -100 & (C != 0 & B != 0)) {
                        cc++;
                        Log.d("HA", "C=B=M");
                    }
                    if (C == B & C == N0 & BM1 > -100 & (C != 0 & B == 0)) {
                        cc++;
                        Log.d("HA", "C=B=M");
                    }
                    if (C == B & C == N0 & BM1 > -100 & (C == 0 & B != 0)) {
                        cc++;
                        Log.d("HA", "C=B=M");
                    }
                }
            }

            if(BM2==0 & BM1 != 0 & (C != 0 & B != 0)) {
                cc++;
                Log.d("HA", "BM2=0");
            }
            if(BM2==0 & BM1 != 0 & (C != 0 & B == 0)) {
                cc++;
                Log.d("HA", "BM2=0");
            }
            if(BM2==0 & BM1 != 0 & (C == 0 & B != 0)) {
                cc++;
                Log.d("HA", "BM2=0");
            }

            if(y1+R2==0 & (C == B & C == 0)) {
                cc++;
                Log.d("HA", "y1+R2==0");
            }

            if(R1 < 0 & R1 >-10 & Z < R1 & (C == B & C == 0)) {
                cc++;
                Log.d("HA", "R1<01");
            }

            if(R1 < 0 & R1 > -10 & Z > 0 & (C == B & C == 0)) {
                cc++;
                Log.d("HA", "R1<02");
            }

            if(lastDigit(x1) == lastDigit(y2) & lastDigit(x2) == lastDigit(y1)) {} else {
                if (R1 < 0 & R1 > -10 & (C != 0 & B != 0)) {
                    cc++;
                    Log.d("HA", "R1<03");
                }
                if (R1 < 0 & R1 > -10 & (C != 0 & B == 0)) {
                    cc++;
                    Log.d("HA", "R1<03");
                }
                if (R1 < 0 & R1 > -10 & (C == 0 & B != 0)) {
                    cc++;
                    Log.d("HA", "R1<03");
                }
            }
            
            if(Math.abs(Crrr) == 1 & (C != 0 & B != 0)) {
                cc++;
                Log.d("HA", "Cr=1");
            }
            if(Math.abs(Crrr) == 1 & (C != 0 & B == 0)) {
                cc++;
                Log.d("HA", "Cr=1");
            }
            if(Math.abs(Crrr) == 1 & (C == 0 & B != 0)) {
                cc++;
                Log.d("HA", "Cr=1");
            }

            if(Math.abs(R1R2rrr) == 1) {} else {
                if (Math.abs(R2rrr) == 1 & Math.abs(R2) != 1 & Math.abs(R2) != 10 & Math.abs(R2) != 100 & R2 > 0 & (C != 0 & B != 0)) {
                    cc++;
                    Log.d("HA", "R2r=1");
                }
                if (Math.abs(R2rrr) == 1 & Math.abs(R2) != 1 & Math.abs(R2) != 10 & Math.abs(R2) != 100 & R2 > 0 & (C != 0 & B == 0)) {
                    cc++;
                    Log.d("HA", "R2r=1");
                }
                if (Math.abs(R2rrr) == 1 & Math.abs(R2) != 1 & Math.abs(R2) != 10 & Math.abs(R2) != 100 & R2 > 0 & (C == 0 & B != 0)) {
                    cc++;
                    Log.d("HA", "R2r=1");
                }
            }

            /*
            if(lastDigit(NGP) == 0 & signGP.equals("Negative") & (C != 0 & B != 0)) {
                cc++;
                Log.d("HA", "NGP=-X0");
            }
            if(lastDigit(NGP) == 0 & signGP.equals("Negative") & (C != 0 & B == 0)) {
                cc++;
                Log.d("HA", "NGP=-X0");
            }
            if(lastDigit(NGP) == 0 & signGP.equals("Negative") & (C == 0 & B != 0)) {
                cc++;
                Log.d("HA", "NGP=-X0");
            }

             */

            if(N0 == M0 & (C != 0 & B == 0)) {
                cc++;
                Log.d("HA", "M=N");
            }

            if(Crrr == Drrr & C != D & C != 0 & D != 0 & (C != 0 & B != 0)) {
                cc++;
                Log.d("HA", "Cr=Dr");
            }
            if(Crrr == Drrr & C != D & C != 0 & D != 0 & (C != 0 & B == 0)) {
                cc++;
                Log.d("HA", "Cr=Dr");
            }
            if(Crrr == Drrr & C != D & C != 0 & D != 0 & (C == 0 & B != 0)) {
                cc++;
                Log.d("HA", "Cr=Dr");
            }

            if(R1==1 & (C != 0 & B != 0)) {
                cc++;
                Log.d("HA", "R1=1");
            }
            if(R1==1 & (C != 0 & B == 0)) {
                cc++;
                Log.d("HA", "R1=1");
            }
            if(R1==1 & (C == 0 & B != 0)) {
                cc++;
                Log.d("HA", "R1=1");
            }

            if(R2 == 1 & (C != 0 & B != 0)) {
                cc++;
                Log.d("HA", "R2=1");
            }
            if(R2 == 1 & (C != 0 & B == 0)) {
                cc++;
                Log.d("HA", "R2=1");
            }
            if(R2 == 1 & (C == 0 & B != 0)) {
                cc++;
                Log.d("HA", "R2=1");
            }


            if(x1rrr == y1rrr & x1 != y1 & x1 != 0 & y1 != 0 & (C != 0 & B != 0)) {
                cc++;
                Log.d("HA", "x1r=y1r");
            }
            if(x1rrr == y1rrr & x1 != y1 & x1 != 0 & y1 != 0 & (C != 0 & B == 0)) {
                cc++;
                Log.d("HA", "x1r=y1r");
            }
            if(x1rrr == y1rrr & x1 != y1 & x1 != 0 & y1 != 0 & (C == 0 & B != 0)) {
                cc++;
                Log.d("HA", "x1r=y1r");
            }

            /*
            if(x1x2rrr == y1y2rrr & x1x2 != y1y2 & x1x2 != 0 & y1y2 != 0 & (C == B & C == 0)) {
                cc++;
                Log.d("HA", "xxr=yyr");
            }
             */

            if(BM1 == BM2) {} else {
                if (lastDigit(C) == lastDigit(D) & C > 0 & D > 0 & (C != 0 & B != 0)) {
                    cc++;
                    Log.d("HA", "C==D");
                }
                if (lastDigit(C) == lastDigit(D) & C > 0 & D > 0 & (C != 0 & B == 0)) {
                    cc++;
                    Log.d("HA", "C==D");
                }
                if (lastDigit(C) == lastDigit(D) & C > 0 & D > 0 & (C == 0 & B != 0)) {
                    cc++;
                    Log.d("HA", "C==D");
                }
                //
                if (lastDigit(C) == lastDigit(D) & C < 0 & D < 0 & (C != 0 & B != 0)) {
                    cc++;
                    Log.d("HA", "C==D");
                }
                if (lastDigit(C) == lastDigit(D) & C < 0 & D < 0 & (C != 0 & B == 0)) {
                    cc++;
                    Log.d("HA", "C==D");
                }
                if (lastDigit(C) == lastDigit(D) & C < 0 & D < 0 & (C == 0 & B != 0)) {
                    cc++;
                    Log.d("HA", "C==D");
                }
            }

            if(Math.abs(Brrr) == 1) {} else {
                if (M0 == C & N0 == B & (C != 0 & B != 0)) {
                    cc++;
                    Log.d("HA", "N=C");
                }
                if (M0 == C & N0 == B & (C != 0 & B == 0)) {
                    cc++;
                    Log.d("HA", "N=C");
                }
                if (M0 == C & N0 == B & (C == 0 & B != 0)) {
                    cc++;
                    Log.d("HA", "N=C");
                }
            }
            
            if(y1 < -100 & (C == B & C == 0)) {
                cc++;
                Log.d("HA", "y1<-100");
            }
            
            if(x1x2 < -100 & (C == B & C == 0)) {
                cc++;
                Log.d("HA", "xx<-100");
            }
            
            if(Math.abs(sumBMBMrrr) == 1 & (C != 0 & B != 0)) {
                cc++;
                Log.d("HA", "BM1+BM2r=1");
            }
            if(Math.abs(sumBMBMrrr) == 1 & (C != 0 & B == 0)) {
                cc++;
                Log.d("HA", "BM1+BM2r=1");
            }
            if(Math.abs(sumBMBMrrr) == 1 & (C == 0 & B != 0)) {
                cc++;
                Log.d("HA", "BM1+BM2r=1");
            }

            if(y1y2 == 0) {
                cc++;
                Log.d("HA", "yy=0");
            }

            if(BM1 == BM2 & BM1 == 0 & (G+V==0) & (C != 0 & B != 0)) {
                cc++;
                Log.d("HA", "BM1=BM2=0");
            }
            if(BM1 == BM2 & BM1 == 0 & (G+V==0) & (C != 0 & B == 0)) {
                cc++;
                Log.d("HA", "BM1=BM2=0");
            }
            if(BM1 == BM2 & BM1 == 0 & (G+V==0) & (C == 0 & B != 0)) {
                cc++;
                Log.d("HA", "BM1=BM2=0");
            }

            if(BM1 == BM2 & BM1 == 0 & lastDigit(Gt) == lastDigit(Vt) & (C != 0 & B != 0)) {
                cc++;
                Log.d("HA", "BM1=BM2=02");
            }
            if(BM1 == BM2 & BM1 == 0 & lastDigit(Gt) == lastDigit(Vt) & (C != 0 & B == 0)) {
                cc++;
                Log.d("HA", "BM1=BM2=02");
            }
            if(BM1 == BM2 & BM1 == 0 & lastDigit(Gt) == lastDigit(Vt) & (C == 0 & B != 0)) {
                cc++;
                Log.d("HA", "BM1=BM2=02");
            }

            anal2.setText(Integer.toString(cc));
           
            if(x1x2 > y1y2) {
                ha = "h";
            }

            if(x1x2 < y1y2) {
                ha = "a";
            }

            if(x1x2 == y1y2) {
                ha = "a";
            }

            int dc = 0;
            
            int GD1 = gdH - gdA;
            int PT1 = pointsH - pointsA;
            int SD1 = X - Y;
            int AD1 = a1 - a2;
            int x11 = GD1 - SD1;
            int y11 = PT1 - AD1;

            String signGD1 = checkPosNeg(GD1);
            int GD1r =  Math.abs(GD1);
            int GD1rr;
            int GD1rrr = 0;
            if ((GD1r > 9 & GD1r < 1000) | (GD1r < -9 & GD1r > -1000)) {
                GD1rr = 0;
                while (GD1r > 0) {
                    GD1rr = GD1rr + GD1r % 10;
                    GD1r = GD1r / 10;
                }
            } else {
                GD1rr = GD1r;
            }
            if(GD1rr > 9) {
                while (GD1rr > 0) {
                    GD1rrr = GD1rrr + GD1rr % 10;
                    GD1rr = GD1rr / 10;
                }
            } else {
                GD1rrr = GD1rr;
            }
            if(signGD1.equals("Negative")) {
                GD1rrr = GD1rrr * -1;
            }

            String signPT1 = checkPosNeg(PT1);
            int PT1r =  Math.abs(PT1);
            int PT1rr;
            int PT1rrr = 0;
            if ((PT1r > 9 & PT1r < 1000) | (PT1r < -9 & PT1r > -1000)) {
                PT1rr = 0;
                while (PT1r > 0) {
                    PT1rr = PT1rr + PT1r % 10;
                    PT1r = PT1r / 10;
                }
            } else {
                PT1rr = PT1r;
            }
            if(PT1rr > 9) {
                while (PT1rr > 0) {
                    PT1rrr = PT1rrr + PT1rr % 10;
                    PT1rr = PT1rr / 10;
                }
            } else {
                PT1rrr = PT1rr;
            }
            if(signPT1.equals("Negative")) {
                PT1rrr = PT1rrr * -1;
            }

            String signSD1 = checkPosNeg(SD1);
            int SD1r =  Math.abs(SD1);
            int SD1rr;
            int SD1rrr = 0;
            if ((SD1r > 9 & SD1r < 1000) | (SD1r < -9 & SD1r > -1000)) {
                SD1rr = 0;
                while (SD1r > 0) {
                    SD1rr = SD1rr + SD1r % 10;
                    SD1r = SD1r / 10;
                }
            } else {
                SD1rr = SD1r;
            }
            if(SD1rr > 9) {
                while (SD1rr > 0) {
                    SD1rrr = SD1rrr + SD1rr % 10;
                    SD1rr = SD1rr / 10;
                }
            } else {
                SD1rrr = SD1rr;
            }
            if(signSD1.equals("Negative")) {
                SD1rrr = SD1rrr * -1;
            }

            String signAD1 = checkPosNeg(AD1);
            int AD1r =  Math.abs(AD1);
            int AD1rr;
            int AD1rrr = 0;
            if ((AD1r > 9 & AD1r < 1000) | (AD1r < -9 & AD1r > -1000)) {
                AD1rr = 0;
                while (AD1r > 0) {
                    AD1rr = AD1rr + AD1r % 10;
                    AD1r = AD1r / 10;
                }
            } else {
                AD1rr = AD1r;
            }
            if(AD1rr > 9) {
                while (AD1rr > 0) {
                    AD1rrr = AD1rrr + AD1rr % 10;
                    AD1rr = AD1rr / 10;
                }
            } else {
                AD1rrr = AD1rr;
            }
            if(signAD1.equals("Negative")) {
                AD1rrr = AD1rrr * -1;
            }

            // Draw Turns

            if(lastDigit(C) == lastDigit(B) & lastDigit(C) == lastDigit(N0) & M0 <= 0) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "C==B==M");
            }

            if(C == B & C == N0 & C == M0) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "C=B=M");
            }

            if(GV + GVT == 0 & (C != 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "G+GVT=0");
            }
            if(GV + GVT == 0 & (C != 0 & B == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "G+GVT=0");
            }
            if(GV + GVT == 0 & (C == 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "G+GVT=0");
            }

            if(R1 == 0 & (C != 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "R1=0");
            }
            if(R1 == 0 & (C != 0 & B == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "R1=0");
            }
            if(R1 == 0 & (C == 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "R1=0");
            }

            if(x1 < -100 & (C != 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "x1<-100");
            }
            if(x1 < -100 & (C != 0 & B == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "x1<-100");
            }
            if(x1 < -100 & (C == 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "x1<-100");
            }

                if(BM1 == BM2) {} else {
                    if (lastDigit(R1) == lastDigit(R2) & (C != 0 & B != 0)) {
                        if (ha.equals("h")) {
                            ha = "a";
                        } else if (ha.equals("a")) {
                            ha = "h";
                        }

                        dc++;
                        Log.d("ha", "R1==R2");
                    }
                    if (lastDigit(R1) == lastDigit(R2) & (C != 0 & B == 0)) {
                        if (ha.equals("h")) {
                            ha = "a";
                        } else if (ha.equals("a")) {
                            ha = "h";
                        }

                        dc++;
                        Log.d("ha", "R1==R2");
                    }
                    if (lastDigit(R1) == lastDigit(R2) & (C == 0 & B != 0)) {
                        if (ha.equals("h")) {
                            ha = "a";
                        } else if (ha.equals("a")) {
                            ha = "h";
                        }

                        dc++;
                        Log.d("ha", "R1==R2");
                    }
                }

            if(BM1 == 0 & BM2 != 0 & (C != 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "BM1=0");
            }
            if(BM1 == 0 & BM2 != 0 & (C != 0 & B == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "BM1=0");
            }
            if(BM1 == 0 & BM2 != 0 & (C == 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "BM1=0");
            }

            if(lastDigit(y1y2) == 0 & signy1y2.equals("Positive") & (C != 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "yy=+X0");
            }
            if(lastDigit(y1y2) == 0 & signy1y2.equals("Positive") & (C != 0 & B == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "yy=+X0");
            }
            if(lastDigit(y1y2) == 0 & signy1y2.equals("Positive") & (C == 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "yy=+X0");
            }

            if(Math.abs(x1x2rrr) == 1 & x1x2 != 1 & x1x2 != 10 & x1x2 != 100 & x1x2 > 0 & (C != 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "xxr=1");
            }
            if(Math.abs(x1x2rrr) == 1 & x1x2 != 1 & x1x2 != 10 & x1x2 != 100 & x1x2 > 0 & (C != 0 & B == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "xxr=1");
            }
            if(Math.abs(x1x2rrr) == 1 & x1x2 != 1 & x1x2 != 10 & x1x2 != 100 & x1x2 > 0 & (C == 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "xxr=1");
            }

            if(R1 < 0 & R1 > -10 & (C == B & B == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "R1<01");
            }

            if(BM1 == BM2 & Math.abs(BM1rrr) == 1 & Math.abs(BM1) != 1 & Math.abs(BM1) != 10 & Math.abs(BM1) != 100 & (C != 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "BM1=BM2r=1");
            }
            if(BM1 == BM2 & Math.abs(BM1rrr) == 1 & Math.abs(BM1) != 1 & Math.abs(BM1) != 10 & Math.abs(BM1) != 100 & (C != 0 & B == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "BM1=BM2r=1");
            }
            if(BM1 == BM2 & Math.abs(BM1rrr) == 1 & Math.abs(BM1) != 1 & Math.abs(BM1) != 10 & Math.abs(BM1) != 100 & (C == 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "BM1=BM2r=1");
            }

            if(lastDigit(x1x2) == lastDigit(y1y2) & (C == B & C == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "xx=yy");
            }

            if(R1 < 0 & R1 > -10 & Z > R1 & x1x2 <= y1y2 & (C == B & C == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "R1<02");
            }

            if(R1 < 0 & R1 > -10 & Z < R1 & x1x2 > y1y2 & (C == B & C == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "R1<03");
            }

            if(R1 > 0 & R1 < 10 & Z < R1 & Z > 0 & (C == B & C == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "R1>04");
            }

            if(y1y2 == 0) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "yy=0");
            }

            if(Crrr == Drrr & C != D & C != 0 & D != 0 & (C != 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "Cr=Dr");
            }
            if(Crrr == Drrr & C != D & C != 0 & D != 0 & (C != 0 & B == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "Cr=Dr");
            }
            if(Crrr == Drrr & C != D & C != 0 & D != 0 & (C == 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "Cr=Dr");
            }

            if(lastDigit(R1) == lastDigit(R2)) {} else {
                if (x1x2 - y1y2 == BM2 & Math.abs(BM2) < 10 & (C != 0 & B != 0)) {
                    if (ha.equals("h")) {
                        ha = "a";
                    } else if (ha.equals("a")) {
                        ha = "h";
                    }

                    dc++;
                    Log.d("ha", "xx-yy=BM2");
                }
                if (x1x2 - y1y2 == BM2 & Math.abs(BM2) < 10 & (C != 0 & B == 0)) {
                    if (ha.equals("h")) {
                        ha = "a";
                    } else if (ha.equals("a")) {
                        ha = "h";
                    }

                    dc++;
                    Log.d("ha", "xx-yy=BM2");
                }
                if (x1x2 - y1y2 == BM2 & Math.abs(BM2) < 10 & (C == 0 & B != 0)) {
                    if (ha.equals("h")) {
                        ha = "a";
                    } else if (ha.equals("a")) {
                        ha = "h";
                    }

                    dc++;
                    Log.d("ha", "xx-yy=BM2");
                }
            }

            if(R2 == 1 & (C != 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "R2=1");
            }
            if(R2 == 1 & (C != 0 & B == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "R2=1");
            }
            if(R2 == 1 & (C == 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "R2=1");
            }

            if(M0 == N0 & (C != 0 & B == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "M=N");
            }

            if(BM1 == GV & BM2 == GVT & (C != 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "BM1=GV");
            }
            if(BM1 == GV & BM2 == GVT & (C != 0 & B == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "BM1=GV");
            }
            if(BM1 == GV & BM2 == GVT & (C == 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "BM1=GV");
            }

            if(lastDigit(C) == lastDigit(D)) {} else {
                if (Math.abs(Drrr) == 1 & Math.abs(D) != 1 & Math.abs(D) != 10 & Math.abs(D) != 100 & (C != 0 & B != 0)) {
                    if (ha.equals("h")) {
                        ha = "a";
                    } else if (ha.equals("a")) {
                        ha = "h";
                    }

                    dc++;
                    Log.d("ha", "Dr=1");
                }
                if (Math.abs(Drrr) == 1 & Math.abs(D) != 1 & Math.abs(D) != 10 & Math.abs(D) != 100 & (C != 0 & B == 0)) {
                    if (ha.equals("h")) {
                        ha = "a";
                    } else if (ha.equals("a")) {
                        ha = "h";
                    }

                    dc++;
                    Log.d("ha", "Dr=1");
                }
                if (Math.abs(Drrr) == 1 & Math.abs(D) != 1 & Math.abs(D) != 10 & Math.abs(D) != 100 & (C == 0 & B != 0)) {
                    if (ha.equals("h")) {
                        ha = "a";
                    } else if (ha.equals("a")) {
                        ha = "h";
                    }

                    dc++;
                    Log.d("ha", "Dr=1");
                }
            }

            if(Math.abs(R1R2rrr) == 1 & R1+R2 > 0 & (C != 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "R1R2r=1");
            }
            if(Math.abs(R1R2rrr) == 1 & R1+R2 > 0 & (C != 0 & B == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "R1R2r=1");
            }
            if(Math.abs(R1R2rrr) == 1 & R1+R2 > 0 & (C == 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "R1R2r=1");
            }

            /*
            if(NXY - R1 == 0) {} else {
                if (Math.abs(R1rrr) == 1 & R1 > 0 & (C != 0 & B != 0)) {
                    if (ha.equals("h")) {
                        ha = "a";
                    } else if (ha.equals("a")) {
                        ha = "h";
                    }

                    dc++;
                    Log.d("ha", "R1r=1");
                }
                if (Math.abs(R1rrr) == 1 & R1 > 0 & (C != 0 & B == 0)) {
                    if (ha.equals("h")) {
                        ha = "a";
                    } else if (ha.equals("a")) {
                        ha = "h";
                    }

                    dc++;
                    Log.d("ha", "R1r=1");
                }
                if (Math.abs(R1rrr) == 1 & R1 > 0 & (C == 0 & B != 0)) {
                    if (ha.equals("h")) {
                        ha = "a";
                    } else if (ha.equals("a")) {
                        ha = "h";
                    }

                    dc++;
                    Log.d("ha", "R1r=1");
                }
            }

             */

            if(x1x2+R2==y1y2+R1 & (C != 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "xx+R2=yy+R1=0");
            }
            if(x1x2+R2==y1y2+R1 & (C != 0 & B == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "xx+R2=yy+R1=0");
            }
            if(x1x2+R2==y1y2+R1 & (C == 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "xx+R2=yy+R1=0");
            }

            if(R2 < 0 & R2 > -10 & (C != 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "R2<0");
            }
            if(R2 < 0 & R2 > -10 & (C != 0 & B == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "R2<0");
            }
            if(R2 < 0 & R2 > -10 & (C == 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "R2<0");
            }

                if (M0 == C & N0 == B & (C != 0 & B != 0)) {
                    if (ha.equals("h")) {
                        ha = "a";
                    } else if (ha.equals("a")) {
                        ha = "h";
                    }

                    dc++;
                    Log.d("ha", "N=C");
                }
                if (M0 == C & N0 == B & (C != 0 & B == 0)) {
                    if (ha.equals("h")) {
                        ha = "a";
                    } else if (ha.equals("a")) {
                        ha = "h";
                    }

                    dc++;
                    Log.d("ha", "N=C");
                }
                if (M0 == C & N0 == B & (C == 0 & B != 0)) {
                    if (ha.equals("h")) {
                        ha = "a";
                    } else if (ha.equals("a")) {
                        ha = "h";
                    }

                    dc++;
                    Log.d("ha", "N=C");
                }


            if(lastDigit(D) == lastDigit(B) & D > 0 & B > 0 & (C != 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "D==B");
            }
            if(lastDigit(D) == lastDigit(B) & D > 0 & B > 0 & (C != 0 & B == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "D==B");
            }
            if(lastDigit(D) == lastDigit(B) & D > 0 & B > 0 & (C == 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "D==B");
            }
            //
            if(lastDigit(D) == lastDigit(B) & D < 0 & B < 0 & (C != 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "D==B");
            }
            if(lastDigit(D) == lastDigit(B) & D < 0 & B < 0 & (C != 0 & B == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "D==B");
            }
            if(lastDigit(D) == lastDigit(B) & D < 0 & B < 0 & (C == 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "D==B");
            }

            if(x1x2 == 0) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "xx=0");
            }

            if(BM1 == BM2 & MN0 != BM2 & BM1 != 0 & BM2 != 0 & (C != 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "BM1=BM2");
            }
            if(BM1 == BM2 & MN0 != BM2 & BM1 != 0 & BM2 != 0 & (C != 0 & B == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "BM1=BM2");
            }
            if(BM1 == BM2 & MN0 != BM2 & BM1 != 0 & BM2 != 0 & (C == 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "BM1=BM2");
            }

            if(Math.abs(MLrrr) == 1 & ML > 0 & ML != 1 & ML != 10 & ML != 100) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "MLr=1");
            }

            if(R1==1 & (C != 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "R1=1");
            }
            if(R1==1 & (C != 0 & B == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "R1=1");
            }
            if(R1==1 & (C == 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "R1=1");
            }

            if(x1x2 > 0 & y1y2 < 0 & (C != 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "xx>0");
            }
            if(x1x2 > 0 & y1y2 < 0 & (C != 0 & B == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "xx>0");
            }
            if(x1x2 > 0 & y1y2 < 0 & (C == 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "xx>0");
            }

            if(x1x2 < 0 & y1y2 > 0 & (C != 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "xx<0");
            }
            if(x1x2 < 0 & y1y2 > 0 & (C != 0 & B == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "xx<0");
            }
            if(x1x2 < 0 & y1y2 > 0 & (C == 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "xx<0");
            }

            if(R1R2f + BM1 == 0 & (C != 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "R1R2+BM1=0");
            }
            if(R1R2f + BM1 == 0 & (C != 0 & B == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "R1R2+BM1=0");
            }
            if(R1R2f + BM1 == 0 & (C == 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "R1R2+BM1=0");
            }

            if(lastDigit(x1) == lastDigit(y2) & lastDigit(x2) == lastDigit(y1) & (C != 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "x1==y2");
            }
            if(lastDigit(x1) == lastDigit(y2) & lastDigit(x2) == lastDigit(y1) & (C != 0 & B == 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "x1==y2");
            }
            if(lastDigit(x1) == lastDigit(y2) & lastDigit(x2) == lastDigit(y1) & (C == 0 & B != 0)) {
                if (ha.equals("h")) {
                    ha = "a";
                } else if (ha.equals("a")) {
                    ha = "h";
                }

                dc++;
                Log.d("ha", "x1==y2");
            }


            ha_txt.setText(ha);
            hac_txt.setText(Integer.toString(dc));

            /*
            //Draw Analysis
            //if(lastDigit(vv5) == 0 & vv5 != 0 & C == B) {} else {
                //if ((C == B & C == 0) | (C != 0 & B == 0) | (C == 0 & B != 0)) { } else {
                   // if((lastDigit(R1R2f) == 0) & ( lastDigit(vv4) == lastDigit(vv5) ) ) {} else {
                       // if(lastDigit(R1R2f) == 0 & R1R2f <= 100) {} else {
                            if (ha.equals("h") & C + B == D) {
                                haXD = "D";
                            }

                            if (ha.equals("a") & C - B == D) {
                                haXD = "D";
                            }
                     //   }
                 //   }
               // }
           // }

            //if(lastDigit(vv4 + vv5) == 0 & C == B & C == 0) {} else {
                //if (vv5 == 0 & C == B) {} else {
                   // if (lastDigit(vv4 + vv5) == 0 & lastDigit(R1R2f) == 0 & vv4 + vv5 != 0 & R1R2f != 0 & C < 100 & C == B & C == 0) {} else {
                       // if ((Mx + Math.abs(R1R2f) == 0) & (C == B & C == 0) & (lastDigit(R1R2f) != lastDigit(BL))) {} else {
                           // if((lastDigit(R1R2f) == 0) & ( lastDigit(vv4) == lastDigit(vv5) ) ) {} else {
            if (lastDigit(vv4 + vv5) == 0 & lastDigit(R1R2f) == 0) {} else {
                if(vv5 > 100) {} else {
                    if(lastDigit(vv4) == lastDigit(vv5)) {} else {
                        if (ha.equals("h") & C == B & C == 0) {
                            if (v4 + v5 == v6) {
                                haXD = "D";
                            }
                        }

                        if (ha.equals("a") & C == B & C == 0) {
                            if (v4 - v5 == v6) {
                                haXD = "D";
                            }
                        }
                    }
                }
            }
                           // }
                       // }
                  //  }
                //}
            //}

            //if((lastDigit(R1R2f) == 0) & ( (lastDigit(vv4) == lastDigit(vv5) & signvv4.equals("Positive") & signvv5.equals("Positive")) | (lastDigit(vv4) == lastDigit(vv5) & signvv4.equals("Negative") & signvv5.equals("Negative")) ) ) {} else {
            if (ha.equals("h") & (C == 0 & B != 0)) {
                if (v4 + v5 == v6) {
                    haXD = "D";
                }
            }

            if (ha.equals("h") & (C != 0 & B == 0)) {
                if (v4 + v5 == v6) {
                    haXD = "D";
                }
            }

            if (ha.equals("a") & (C == 0 & B != 0)) {
                if (v4 - v5 == v6) {
                    haXD = "D";
                }
            }

            if (ha.equals("a") & (C != 0 & B == 0)) {
                if (v4 - v5 == v6) {
                    haXD = "D";
                }
            }
            //}

             */

            if(ha.equals("h") & v4 + v5 == v6) {
                haXD = "D";
            }

            if(ha.equals("a") & v4 - v5 == v6) {
                haXD = "D";
            }

            ds_res_txt3.setText(haXD);

            /////

                if (xStart.equals("H") & !isOdd(cc)) {
                    final_anal_txt.setText("HHHH");
                }

                if (xStart.equals("H") & isOdd(cc)) {
                    final_anal_txt.setText("AAAA");
                }

                if (xStart.equals("A") & !isOdd(cc)) {
                    final_anal_txt.setText("AAAA");
                }

                if (xStart.equals("A") & isOdd(cc)) {
                    final_anal_txt.setText("HHHH");
                }

        });
    }

    boolean isOdd( int val ) { return (val & 0x01) != 0; }

    static String checkPosNeg(int x) {
        // checks the number is greater than 0 or not
        if (x > 0)
            return "Positive";
        else if (x < 0)
            return "Negative";
        else
            return "zero";
    }

    private int lastDigit(int number) { return Math.abs(number) % 10; }

    private static void hideKeyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Find the currently focused view, so we can grab the correct window token from it.
        View view = activity.getCurrentFocus();
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = new View(activity);
        }
        assert imm != null;
        Objects.requireNonNull(imm).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}

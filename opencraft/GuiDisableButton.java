package net.minecraft.src;
// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class GuiDisableButton extends Gui
{

    public GuiDisableButton(FontRenderer fontrenderer, int i, int j, int k, int l, String s)
    {
        field_22082_a = false;
        field_22081_b = true;
        field_22080_c = fontrenderer;
        field_22079_d = i;
        field_22078_e = j;
        field_22077_f = k;
        field_22076_g = l;
        func_22068_a(s);
    }

    public void func_22068_a(String s)
    {
        field_22075_h = s;
    }

    public String func_22071_a()
    {
        return field_22075_h;
    }

    public void func_22070_b()
    {
        field_22073_k++;
    }

    public void func_22072_a(char c, int i)
    {
        if(!field_22081_b || !field_22082_a)
        {
            return;
        }
        if(c == '\026')
        {
        String s;
        int j;
        s = GuiScreen.getClipboardString();
        if(s == null)
        {
            s = "";
        }
        j = 32 - field_22075_h.length();
        if(j > s.length())
        {
            j = s.length();
        }
        if(j > 0)
        {
        	field_22075_h += s.substring(0, j);
        }
        }
        if(i == 14 && field_22075_h.length() > 0)
        {
            field_22075_h = field_22075_h.substring(0, field_22075_h.length() - 1);
        }
        if(FontAllowedCharacters.allowedCharacters.indexOf(c) >= 0 && (field_22075_h.length() < field_22074_i || field_22074_i == 0))
        {
        	field_22075_h += c;
        }
    }

    public void func_22069_a(int i, int j, int k)
    {
        boolean flag = field_22081_b && i >= field_22079_d && i < field_22079_d + field_22077_f && j >= field_22078_e && j < field_22078_e + field_22076_g;
        if(flag && !field_22082_a)
        {
            field_22073_k = 0;
        }
        field_22082_a = flag;
    }

    public void func_22067_c()
    {
        drawRect(field_22079_d - 1, field_22078_e - 1, field_22079_d + field_22077_f + 1, field_22078_e + field_22076_g + 1, 0xffa0a0a0);
        drawRect(field_22079_d, field_22078_e, field_22079_d + field_22077_f, field_22078_e + field_22076_g, 0xff000000);
        if(field_22081_b)
        {
            boolean flag = field_22082_a && (field_22073_k / 6) % 2 == 0;
            drawString(field_22080_c, (new StringBuilder()).append(field_22075_h).append(flag ? "_" : "").toString(), field_22079_d + 4, field_22078_e + (field_22076_g - 8) / 2, 0xe0e0e0);
        } else
        {
            drawString(field_22080_c, field_22075_h, field_22079_d + 4, field_22078_e + (field_22076_g - 8) / 2, 0x707070);
        }
    }

    public void func_22066_a(int i)
    {
        field_22074_i = i;
    }

    private final FontRenderer field_22080_c;
    private final int field_22079_d;
    private final int field_22078_e;
    private final int field_22077_f;
    private final int field_22076_g;
    private String field_22075_h;
    private int field_22074_i;
    private int field_22073_k;
    public boolean field_22082_a;
    public boolean field_22081_b;
}

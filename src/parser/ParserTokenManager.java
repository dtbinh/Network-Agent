/* Generated By:JavaCC: Do not edit this line. ParserTokenManager.java */
package parser;
import syntax.Node;
import syntax.StartNode;
import syntax.ActionNode;
import syntax.ActionsNode;
import syntax.CloneNode;
import syntax.DefinitionNode;
import syntax.ExecNode;
import syntax.HostNodeNode;
import syntax.MigrateNode;
import syntax.ParamsNode;
import syntax.ReportNode;
import syntax.RunNode;
import syntax.ComputeNode;

/** Token Manager. */
public class ParserTokenManager implements ParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x800000000L) != 0L)
            return 2;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 36:
         return jjStartNfaWithStates_0(0, 35, 2);
      case 40:
         return jjStopAtPos(0, 27);
      case 41:
         return jjStopAtPos(0, 28);
      case 44:
         return jjStopAtPos(0, 24);
      case 46:
         return jjStopAtPos(0, 25);
      case 58:
         return jjStopAtPos(0, 26);
      case 59:
         return jjStopAtPos(0, 30);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x700L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x121000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x820L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x10000002000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x640080L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x18000L);
      case 123:
         return jjStopAtPos(0, 38);
      case 125:
         return jjStopAtPos(0, 39);
      default :
         return jjMoveNfa_0(1, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      case 98:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x6000a0L);
      case 103:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000L);
      case 111:
         if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(1, 15);
         return jjMoveStringLiteralDfa2_0(active0, 0x101000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x90000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000040600L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x140L);
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x20L);
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x101000L);
      case 110:
         if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(2, 18);
         break;
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0xa0000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x600080L);
      case 115:
         if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(2, 13);
         break;
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000800e00L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x10040L);
      case 101:
         if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(3, 11);
         break;
      case 104:
         return jjMoveStringLiteralDfa4_0(active0, 0x600L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x20L);
      case 109:
         if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(3, 19);
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x20100L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x600080L);
      case 112:
         if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(3, 23);
         return jjMoveStringLiteralDfa4_0(active0, 0x10000100000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
      case 101:
         if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(4, 16);
         else if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(4, 17);
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x20L);
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x600L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x600080L);
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000100040L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 73:
         return jjMoveStringLiteralDfa6_0(active0, 0x100L);
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x20L);
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000L);
      case 114:
         if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 9;
            jjmatchedPos = 5;
         }
         return jjMoveStringLiteralDfa6_0(active0, 0x400L);
      case 116:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(5, 40);
         return jjMoveStringLiteralDfa6_0(active0, 0x7040c0L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa7_0(active0, 0x400L);
      case 68:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(6, 8);
         break;
      case 99:
         return jjMoveStringLiteralDfa7_0(active0, 0x200000L);
      case 101:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(6, 6);
         else if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(6, 14);
         else if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(6, 20);
         break;
      case 102:
         return jjMoveStringLiteralDfa7_0(active0, 0x80L);
      case 109:
         return jjMoveStringLiteralDfa7_0(active0, 0x400000L);
      case 116:
         if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(6, 12);
         return jjMoveStringLiteralDfa7_0(active0, 0x20L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa8_0(active0, 0x600000L);
      case 101:
         return jjMoveStringLiteralDfa8_0(active0, 0x400L);
      case 105:
         return jjMoveStringLiteralDfa8_0(active0, 0xa0L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa9_0(active0, 0x400000L);
      case 108:
         return jjMoveStringLiteralDfa9_0(active0, 0x200000L);
      case 109:
         return jjMoveStringLiteralDfa9_0(active0, 0x400L);
      case 110:
         return jjMoveStringLiteralDfa9_0(active0, 0x80L);
      case 111:
         return jjMoveStringLiteralDfa9_0(active0, 0x20L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa10_0(active0, 0x480L);
      case 108:
         if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(9, 22);
         return jjMoveStringLiteralDfa10_0(active0, 0x200000L);
      case 110:
         if ((active0 & 0x20L) != 0L)
            return jjStopAtPos(9, 5);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 98:
         return jjMoveStringLiteralDfa11_0(active0, 0x200000L);
      case 105:
         return jjMoveStringLiteralDfa11_0(active0, 0x400L);
      case 108:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(10, 7);
         break;
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa12_0(active0, 0x200000L);
      case 108:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(11, 10);
         break;
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
private int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa13_0(active0, 0x200000L);
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
private int jjMoveStringLiteralDfa13_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0);
      return 13;
   }
   switch(curChar)
   {
      case 107:
         if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(13, 21);
         break;
      default :
         break;
   }
   return jjStartNfa_0(12, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 16;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 31)
                        kind = 31;
                     jjCheckNAdd(0);
                  }
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(5, 14);
                  else if (curChar == 36)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAdd(0);
                  break;
               case 3:
                  if ((0x3ff100000000000L & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 4:
                  if (curChar == 34)
                     jjCheckNAddTwoStates(5, 14);
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 7:
                  if (curChar == 46)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 10:
                  if (curChar == 46)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 11:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 13:
                  if (curChar == 34 && kind > 29)
                     kind = 29;
                  break;
               case 14:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(14, 15);
                  break;
               case 15:
                  if (curChar == 34 && kind > 37)
                     kind = 37;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
               case 3:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAdd(3);
                  break;
               case 14:
                  jjAddStates(0, 1);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 14:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 1);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 16 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   14, 15, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\144\145\146\151\156\151\164\151\157\156", 
"\145\170\145\143\165\164\145", "\162\145\160\157\162\164\146\151\156\141\154", 
"\141\147\145\156\164\111\104", "\141\165\164\150\157\162", "\141\165\164\150\157\162\55\145\155\141\151\154", 
"\144\141\164\145", "\143\157\155\155\145\156\164", "\157\142\163", 
"\155\151\147\162\141\164\145", "\164\157", "\164\162\141\143\145", "\143\154\157\156\145", "\162\165\156", 
"\146\162\157\155", "\143\157\155\160\165\164\145", 
"\162\145\160\157\162\164\143\141\154\154\142\141\143\153", "\162\145\160\157\162\164\155\141\151\154", "\163\155\164\160", "\54", "\56", 
"\72", "\50", "\51", null, "\73", null, null, null, null, "\44", null, null, "\173", 
"\175", "\157\165\164\160\165\164", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1f8ffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[16];
private final int[] jjstateSet = new int[32];
protected char curChar;
/** Constructor. */
public ParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public ParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 16; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}

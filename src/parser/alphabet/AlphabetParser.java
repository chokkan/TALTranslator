/* Generated By:JavaCC: Do not edit this line. AlphabetParser.java */
package parser.alphabet;
import tal.TALConstants;
import java.util.HashMap;

/**
 * Alphabet parser. The alphabet has the following syntax:
 * 
 * fluents {
 *     fluent1;
 *     fluent2;
 *     ...
 * }
 * 
 * actions {
 *     action1;
 *     action2;
 *     ...
 * }
 * 
 * constants {
 *     constant1;
 *     constant2;
 *     ...
 * }
 * 
 * Comments can be entered both using // comments or /* comments */

/**
 * @author Marc van Zee (marcvanzee@gmail.com) - Link�ping University
 *
 */
public class AlphabetParser implements AlphabetParserConstants {

////////////////////
//   the parser   //
////////////////////
  final public HashMap<String, Integer> alphabet() throws ParseException {
        HashMap<String, Integer> alphabet = new HashMap<String, Integer>();
        HashMap<String, Integer> temp;
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case FLUENTS:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      temp = fluents();
                           alphabet.putAll(temp);
    }
    jj_consume_token(0);
  {if (true) return alphabet;}
    throw new Error("Missing return statement in function");
  }

  final public HashMap<String, Integer> fluents() throws ParseException {
        HashMap<String, Integer> fluents = new HashMap<String, Integer>();
        Token s;
    jj_consume_token(FLUENTS);
    jj_consume_token(LACC);
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IDENT:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        break label_2;
      }
      s = jj_consume_token(IDENT);
                                  fluents.put(s.image, TALConstants.FLUENT);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        jj_consume_token(COMMA);
        break;
      case SEMICOLON:
        jj_consume_token(SEMICOLON);
        break;
      default:
        jj_la1[2] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(RACC);
  {if (true) return fluents;}
    throw new Error("Missing return statement in function");
  }

  final public HashMap<String, Integer> actions() throws ParseException {
        HashMap<String, Integer> actions = new HashMap<String, Integer>();
        Token s;
    jj_consume_token(ACTIONS);
    jj_consume_token(LACC);
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IDENT:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_3;
      }
      s = jj_consume_token(IDENT);
                                  actions.put(s.image, TALConstants.ACTION);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        jj_consume_token(COMMA);
        break;
      case SEMICOLON:
        jj_consume_token(SEMICOLON);
        break;
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(RACC);
  {if (true) return actions;}
    throw new Error("Missing return statement in function");
  }

  final public HashMap<String, Integer> constants() throws ParseException {
        HashMap<String, Integer> constants = new HashMap<String, Integer>();
        Token s;
    jj_consume_token(CONSTANTS);
    jj_consume_token(LACC);
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IDENT:
        ;
        break;
      default:
        jj_la1[5] = jj_gen;
        break label_4;
      }
      s = jj_consume_token(IDENT);
                                  constants.put(s.image, TALConstants.CONSTANT);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        jj_consume_token(COMMA);
        break;
      case SEMICOLON:
        jj_consume_token(SEMICOLON);
        break;
      default:
        jj_la1[6] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(RACC);
  {if (true) return constants;}
    throw new Error("Missing return statement in function");
  }

  /** Generated Token Manager. */
  public AlphabetParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[7];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x2000,0x10000,0x1800,0x10000,0x1800,0x10000,0x1800,};
   }

  /** Constructor with InputStream. */
  public AlphabetParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public AlphabetParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new AlphabetParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public AlphabetParser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new AlphabetParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public AlphabetParser(AlphabetParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(AlphabetParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[17];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 7; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 17; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

                             }

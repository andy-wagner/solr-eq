/* Generated By:JavaCC: Do not edit this line. QueryParserConstants.java */
package solr.extentions.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface QueryParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int _NUM_CHAR = 1;
  /** RegularExpression Id. */
  int _ESCAPED_CHAR = 2;
  /** RegularExpression Id. */
  int _TERM_START_CHAR = 3;
  /** RegularExpression Id. */
  int _TERM_CHAR = 4;
  /** RegularExpression Id. */
  int _WHITESPACE = 5;
  /** RegularExpression Id. */
  int _QUOTED_CHAR = 6;
  /** RegularExpression Id. */
  int _SQUOTED_CHAR = 7;
  /** RegularExpression Id. */
  int AND = 13;
  /** RegularExpression Id. */
  int OR = 14;
  /** RegularExpression Id. */
  int NOT = 15;
  /** RegularExpression Id. */
  int DISJ = 16;
  /** RegularExpression Id. */
  int PLUS = 17;
  /** RegularExpression Id. */
  int MINUS = 18;
  /** RegularExpression Id. */
  int BAREOPER = 19;
  /** RegularExpression Id. */
  int LPAREN = 20;
  /** RegularExpression Id. */
  int RPAREN = 21;
  /** RegularExpression Id. */
  int COLON = 22;
  /** RegularExpression Id. */
  int STAR = 23;
  /** RegularExpression Id. */
  int CARAT = 24;
  /** RegularExpression Id. */
  int QUOTED = 25;
  /** RegularExpression Id. */
  int TERM = 26;
  /** RegularExpression Id. */
  int FUZZY_SLOP = 27;
  /** RegularExpression Id. */
  int PREFIXTERM = 28;
  /** RegularExpression Id. */
  int WILDTERM = 29;
  /** RegularExpression Id. */
  int REGEXPTERM = 30;
  /** RegularExpression Id. */
  int RANGEIN_START = 31;
  /** RegularExpression Id. */
  int RANGEEX_START = 32;
  /** RegularExpression Id. */
  int LPARAMS = 33;
  /** RegularExpression Id. */
  int FILTER = 34;
  /** RegularExpression Id. */
  int NUMBER = 35;
  /** RegularExpression Id. */
  int RANGE_TO = 36;
  /** RegularExpression Id. */
  int RANGEIN_END = 37;
  /** RegularExpression Id. */
  int RANGEEX_END = 38;
  /** RegularExpression Id. */
  int RANGE_QUOTED = 39;
  /** RegularExpression Id. */
  int RANGE_GOOP = 40;

  /** Lexical state. */
  int Boost = 0;
  /** Lexical state. */
  int Range = 1;
  /** Lexical state. */
  int COMMENT = 2;
  /** Lexical state. */
  int DEFAULT = 3;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "<_NUM_CHAR>",
    "<_ESCAPED_CHAR>",
    "<_TERM_START_CHAR>",
    "<_TERM_CHAR>",
    "<_WHITESPACE>",
    "<_QUOTED_CHAR>",
    "<_SQUOTED_CHAR>",
    "<token of kind 8>",
    "\"/*\"",
    "\"*/\"",
    "<token of kind 11>",
    "<token of kind 12>",
    "<AND>",
    "<OR>",
    "<NOT>",
    "\"<<\"",
    "\"+\"",
    "\"-\"",
    "<BAREOPER>",
    "\"(\"",
    "\")\"",
    "\":\"",
    "\"*\"",
    "\"^\"",
    "<QUOTED>",
    "<TERM>",
    "<FUZZY_SLOP>",
    "<PREFIXTERM>",
    "<WILDTERM>",
    "<REGEXPTERM>",
    "\"[\"",
    "\"{\"",
    "<LPARAMS>",
    "\"filter(\"",
    "<NUMBER>",
    "\"TO\"",
    "\"]\"",
    "\"}\"",
    "<RANGE_QUOTED>",
    "<RANGE_GOOP>",
  };

}
//
// Generated by JTB 1.3.2
//

package parser.visitor;
import parser.syntaxtree.*;
import java.util.*;

/**
 * All void visitors must implement this interface.
 */

public interface Visitor {

   //
   // void Auto class visitors
   //

   public void visit(NodeList n);
   public void visit(NodeListOptional n);
   public void visit(NodeOptional n);
   public void visit(NodeSequence n);
   public void visit(NodeToken n);

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> fof()
    * f1 -> <EOF>
    */
   public void visit(one_line n);

   /**
    * f0 -> implication()
    * f1 -> ( <EQUIV> implication() )*
    */
   public void visit(fof n);

   /**
    * f0 -> disjunction()
    * f1 -> ( <IMPLIC> disjunction() )*
    */
   public void visit(implication n);

   /**
    * f0 -> conjunction()
    * f1 -> ( <OR> conjunction() )*
    */
   public void visit(disjunction n);

   /**
    * f0 -> unary()
    * f1 -> ( <AND> unary() )*
    */
   public void visit(conjunction n);

   /**
    * f0 -> literal()
    *       | quantification()
    */
   public void visit(unary n);

   /**
    * f0 -> ( <EXISTS> | <FORALL> )
    * f1 -> <VAR>
    * f2 -> <COLON>
    * f3 -> unary()
    */
   public void visit(quantification n);

   /**
    * f0 -> atom()
    *       | negation()
    */
   public void visit(literal n);

   /**
    * f0 -> <NOT>
    * f1 -> unary()
    */
   public void visit(negation n);

   /**
    * f0 -> terminal()
    *       | <LPAR> fof() <RPAR>
    *       | <LBRACK> fof() <RBRACK>
    */
   public void visit(atom n);

   /**
    * f0 -> <VAR>
    *       | predicate()
    */
   public void visit(terminal n);

   /**
    * f0 -> <IDENT>
    * f1 -> [ argblock() ]
    */
   public void visit(predicate n);

   /**
    * f0 -> <LPAR>
    * f1 -> [ args() ]
    * f2 -> <RPAR>
    */
   public void visit(argblock n);

   /**
    * f0 -> arg()
    * f1 -> ( <COMMA> arg() )*
    */
   public void visit(args n);

   /**
    * f0 -> predicate()
    *       | <IDENT>
    *       | <VAR>
    *       | <NUM>
    */
   public void visit(arg n);

}


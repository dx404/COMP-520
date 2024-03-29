/**
 * miniJava Abstract Syntax Tree classes
 * @author prins
 * @version COMP 520 (v2.2)
 */
package miniJava.AbstractSyntaxTrees;

import miniJava.ContextualAnalyzer.IdentificationTable;

/**
 * An implementation of the Visitor interface provides a method visitX
 * for each non-abstract AST class X.  
 */
public interface Visitor<ArgType,ResultType> {

	// Package
	public ResultType visitPackage(Package prog, ArgType arg);

	// Declarations
	public ResultType visitClassDecl(ClassDecl cd, ArgType arg);
	public ResultType visitFieldDecl(FieldDecl fd, ArgType arg);
	public ResultType visitMethodDecl(MethodDecl md, ArgType arg);
	public ResultType visitMethodDeclHead(MethodDecl md, ArgType arg); 
	//pa3 added return type function name
	public ResultType visitMethodDeclBody(MethodDecl md, ArgType arg); 
	//pa3 added parameterlist and boday
	public ResultType visitParameterDecl(ParameterDecl pd, ArgType arg);
	public ResultType visitVarDecl(VarDecl decl, ArgType arg);

	// Types
	public ResultType visitBaseType(BaseType type, ArgType arg);
	public ResultType visitClassType(ClassType type, ArgType arg);
	public ResultType visitArrayType(ArrayType type, ArgType arg);
	
	public ResultType visitErrorType(ErrorType type, ArgType arg); //pa3 added
	public ResultType visitUnsupportedType(UnsupportedType type, ArgType arg); //pa3 added

	// Statements
	public ResultType visitBlockStmt(BlockStmt stmt, ArgType arg);
	public ResultType visitVardeclStmt(VarDeclStmt stmt, ArgType arg);
	public ResultType visitAssignStmt(AssignStmt stmt, ArgType arg);
	public ResultType visitCallStmt(CallStmt stmt, ArgType arg);
	public ResultType visitIfStmt(IfStmt stmt, ArgType arg);
	public ResultType visitWhileStmt(WhileStmt stmt, ArgType arg);

	// Expressions
	public ResultType visitUnaryExpr(UnaryExpr expr, ArgType arg);
	public ResultType visitBinaryExpr(BinaryExpr expr, ArgType arg);
	public ResultType visitRefExpr(RefExpr expr, ArgType arg);
	public ResultType visitCallExpr(CallExpr expr, ArgType arg);
	public ResultType visitLiteralExpr(LiteralExpr expr, ArgType arg);
	public ResultType visitNewObjectExpr(NewObjectExpr expr, ArgType arg);
	public ResultType visitNewArrayExpr(NewArrayExpr expr, ArgType arg);

	// References
	public ResultType visitQualifiedRef(QualifiedRef ref, ArgType arg);
	//public ResultType visitQualifiedRef(Reference ref, ArgType arg);
	public ResultType visitIndexedRef(IndexedRef ref, ArgType arg);
	//\begin{pa3 added}
	public ResultType visitLocalRef(LocalRef ref, ArgType arg);
	public ResultType visitMemberRef(MemberRef ref, ArgType arg);
	public ResultType visitClassRef(ClassRef ref, ArgType arg);
	public ResultType visitThisRef(ThisRef ref, ArgType arg);
	public ResultType visitDeRef(DeRef ref, ArgType arg);
	//end{pa3 added}

	// Terminals
	public ResultType visitIdentifier(Identifier id, ArgType arg);
	public ResultType visitOperator(Operator op, ArgType arg);
	public ResultType visitIntLiteral(IntLiteral num, ArgType arg);
	public ResultType visitBooleanLiteral(BooleanLiteral bool, ArgType arg);
	
	public ResultType visitArrayLengthRef(ArrayLengthRef arrlenRef, ArgType arg);

}

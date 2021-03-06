/*******************************************************************************
 * Copyright (c) 2009, 2011 Sierra Wireless and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sierra Wireless - initial API and implementation
 *******************************************************************************/

/**
 * @author	Kevin KIN-FOO <kkinfoo@anyware-tech.com>
 * @date $Date: 2009-06-18 16:46:07 +0200 (jeu., 18 juin 2009) $
 * $Author: kkinfoo $
 * $Id: ForInPair.java 1887 2009-06-18 14:46:07Z kkinfoo $
 */
package org.eclipse.koneki.ldt.parser.ast.statements;

import org.eclipse.dltk.ast.ASTVisitor;

// TODO: Auto-generated Javadoc
/**
 * The Class ForInPair.
 */
public class ForInPair extends Chunk {

	/** The identifiers. */
	private Chunk identifiers;

	/** The expressions. */
	private Chunk expressions;

	/**
	 * Instantiates a new for in pair.
	 * 
	 * @param start
	 *            the start
	 * @param end
	 *            the end
	 * @param identifiers
	 *            the identifiers
	 * @param expressions
	 *            the expressions
	 * @param chunk
	 *            the chunk
	 */
	public ForInPair(int start, int end, Chunk identifiers, Chunk expressions, Chunk chunk) {
		super(start, end, chunk.getStatements());
		this.expressions = expressions;
		this.identifiers = identifiers;
	}

	/**
	 * Gets the identifiers.
	 * 
	 * @return the identifiers
	 */
	public Chunk getIdentifiers() {
		return identifiers;
	}

	/**
	 * Gets the expressions.
	 * 
	 * @return the expressions
	 */
	public Chunk getExpressions() {
		return expressions;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.dltk.ast.statements.Block#traverse(org.eclipse.dltk.ast. ASTVisitor)
	 */
	public void traverse(ASTVisitor pVisitor) throws Exception {
		if (pVisitor.visit(this)) {
			super.traverse(pVisitor);
			identifiers.traverse(pVisitor);
			expressions.traverse(pVisitor);
			pVisitor.endvisit(this);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.dltk.ast.statements.Block#getKind()
	 */
	@Override
	public int getKind() {
		return S_FOREACH;
	}

}

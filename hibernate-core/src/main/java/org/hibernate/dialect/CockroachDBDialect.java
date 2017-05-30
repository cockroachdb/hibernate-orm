/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.dialect;

import java.sql.Types;

import org.hibernate.dialect.function.StandardSQLFunction;
import org.hibernate.type.StandardBasicTypes;

/**
 * An SQL dialect for CockroachDB.
 * Makes no changes at the moment, since CockroachDB now provides type aliases
 * for all types that Hibernate uses. Keeping this file around for the future,
 * though.
 */
public class CockroachDBDialect extends PostgreSQL94Dialect {

  /**
   * Constructs a CockroachDBDialect
   */
  public CockroachDBDialect() {
    super();
  }

  @Override
  public boolean supportsSequences() {
    return false;
  }

  @Override
  public String getForUpdateString() {
    return "";
  }

	@Override
	public String getWriteLockString(int timeout) {
    return "";
	}
}
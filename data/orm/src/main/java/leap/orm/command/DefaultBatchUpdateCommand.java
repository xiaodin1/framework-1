/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package leap.orm.command;

import leap.orm.dao.Dao;
import leap.orm.mapping.EntityMapping;
import leap.orm.sql.SqlCommand;

public class DefaultBatchUpdateCommand extends AbstractEntityDaoCommand implements BatchUpdateCommand {

    protected final EntityMapping em;
    protected final Object[]      records;
    protected final SqlCommand    updateCommand;

    public DefaultBatchUpdateCommand(Dao dao, EntityMapping em, Object[] records) {
        super(dao, em);

        this.em            = em;
        this.records       = records;
        this.updateCommand = metadata.getSqlCommand(em.getEntityName(), SqlCommand.UPDATE_COMMAND_NAME);
    }

    @Override
    public int[] execute() {
        return updateCommand.executeBatchUpdate(this, records);
    }
}

/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.api.installer.shared.dto;

import java.util.List;
import java.util.Map;
import org.eclipse.che.api.installer.shared.model.Installer;
import org.eclipse.che.api.workspace.shared.dto.ServerConfigDto;
import org.eclipse.che.dto.shared.DTO;

/** @author Anatoliy Bazko */
@DTO
@Deprecated
public interface InstallerDto extends Installer {

  @Override
  String getId();

  void setId(String id);

  InstallerDto withId(String id);

  @Override
  String getName();

  void setName(String name);

  InstallerDto withName(String name);

  @Override
  String getVersion();

  void setVersion(String version);

  InstallerDto withVersion(String version);

  @Override
  String getDescription();

  void setDescription(String description);

  InstallerDto withDescription(String description);

  @Override
  List<String> getDependencies();

  void setDependencies(List<String> dependencies);

  InstallerDto withDependencies(List<String> dependencies);

  @Override
  String getScript();

  void setScript(String script);

  InstallerDto withScript(String script);

  @Override
  Map<String, String> getProperties();

  void setProperties(Map<String, String> properties);

  InstallerDto withProperties(Map<String, String> properties);

  @Override
  Map<String, ServerConfigDto> getServers();

  void setServers(Map<String, ServerConfigDto> servers);

  InstallerDto withServers(Map<String, ServerConfigDto> servers);
}

/* 
 * Sourcerer: an infrastructure for large-scale source code analysis.
 * Copyright (C) by contributors. See CONTRIBUTORS.txt for full list.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package edu.uci.ics.sourcerer.tools.java.repo.model.extracted;

import java.util.Collection;

import edu.uci.ics.sourcerer.tools.core.repo.model.ProjectLocation;
import edu.uci.ics.sourcerer.tools.core.repo.model.Repository;

/**
 * @author Joel Ossher (jossher@uci.edu)
 */
public interface ExtractedJavaRepository extends Repository {
  @Override
  public Collection<? extends ExtractedJavaBatch> getBatches();
  
  @Override
  public ExtractedJavaProject getProject(String path);
  
  @Override
  public ExtractedJavaProject getProject(Integer batch, Integer checkout);
  
  @Override
  public ExtractedJavaProject getProject(ProjectLocation loc);

  @Override
  public Collection<? extends ExtractedJavaProject> getProjects();
  
  public ExtractedJarFile getJarFile(String hash);
  
  public Collection<? extends ExtractedJarFile> getMavenJarFiles();
  
  public Collection<? extends ExtractedJarFile> getProjectJarFiles();
  
  public Collection<? extends ExtractedJarFile> getLibraryJarFiles();
}

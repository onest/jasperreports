/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2016 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.jasperreports.export;

import net.sf.jasperreports.annotations.properties.Property;
import net.sf.jasperreports.annotations.properties.PropertyScope;
import net.sf.jasperreports.engine.JRPropertiesUtil;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.export.annotations.ExporterProperty;
import net.sf.jasperreports.properties.PropertyConstants;


/**
 * Interface containing settings used by the DOCX exporter.
 *
 * @see JRDocxExporter
 * 
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 */
public interface DocxExporterConfiguration extends ExporterConfiguration
{
	/**
	 * Property whose value is used as default for the {@link #getMetadataTitle()} export configuration setting.
	 */
	@Property(
			category = PropertyConstants.CATEGORY_EXPORT,
			scopes = {PropertyScope.CONTEXT, PropertyScope.REPORT},
			sinceVersion = PropertyConstants.VERSION_6_3_1
			)
	public static final String PROPERTY_METADATA_TITLE = JRPropertiesUtil.PROPERTY_PREFIX + "export.docx.metadata.title";

	/**
	 * Property whose value is used as default for the {@link #getMetadataAuthor()} export configuration setting.
	 */
	@Property(
			category = PropertyConstants.CATEGORY_EXPORT,
			scopes = {PropertyScope.CONTEXT, PropertyScope.REPORT},
			sinceVersion = PropertyConstants.VERSION_6_3_1
			)
	public static final String PROPERTY_METADATA_AUTHOR = JRPropertiesUtil.PROPERTY_PREFIX + "export.docx.metadata.author";

	/**
	 * Property whose value is used as default for the {@link #getMetadataSubject()} export configuration setting.
	 */
	@Property(
			category = PropertyConstants.CATEGORY_EXPORT,
			scopes = {PropertyScope.CONTEXT, PropertyScope.REPORT},
			sinceVersion = PropertyConstants.VERSION_6_3_1
			)
	public static final String PROPERTY_METADATA_SUBJECT = JRPropertiesUtil.PROPERTY_PREFIX + "export.docx.metadata.subject";

	/**
	 * Property whose value is used as default for the {@link #getMetadataKeywords()} export configuration setting.
	 */
	@Property(
			category = PropertyConstants.CATEGORY_EXPORT,
			scopes = {PropertyScope.CONTEXT, PropertyScope.REPORT},
			sinceVersion = PropertyConstants.VERSION_6_3_1
			)
	public static final String PROPERTY_METADATA_KEYWORDS = JRPropertiesUtil.PROPERTY_PREFIX + "export.docx.metadata.keywords";

	/**
	 * Property whose value is used as default for the {@link #getMetadataApplication()} export configuration setting.
	 */
	@Property(
			category = PropertyConstants.CATEGORY_EXPORT,
			scopes = {PropertyScope.CONTEXT, PropertyScope.REPORT},
			sinceVersion = PropertyConstants.VERSION_6_3_1
			)
	public static final String PROPERTY_METADATA_APPLICATION = JRPropertiesUtil.PROPERTY_PREFIX + "export.docx.metadata.application";

	/**
	 * The Title of the DOCX document.
	 */
	@ExporterProperty(PROPERTY_METADATA_TITLE)
	public String getMetadataTitle();

	/**
	 * The Author of the DOCX document.
	 */
	@ExporterProperty(PROPERTY_METADATA_AUTHOR)
	public String getMetadataAuthor();

	/**
	 * The Subject of the DOCX document.
	 */
	@ExporterProperty(PROPERTY_METADATA_SUBJECT)
	public String getMetadataSubject();

	/**
	 * The Keywords of the DOCX document.
	 */
	@ExporterProperty(PROPERTY_METADATA_KEYWORDS)
	public String getMetadataKeywords();

	/**
	 * The Application for the DOCX document. Defaults to "JasperReports Library version x.x.x".
	 */
	@ExporterProperty(PROPERTY_METADATA_APPLICATION)
	public String getMetadataApplication();
}

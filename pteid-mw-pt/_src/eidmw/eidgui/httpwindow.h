/* ****************************************************************************

 * PTeID Middleware Project.
 * Copyright (C) 2011-2012 Caixa Mágica Software.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version
 * 3.0 as published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, see
 * http://www.gnu.org/licenses/.
 *
 * Author: Luis Medinas <luis.medinas@caixamagica.pt>
 **************************************************************************** */
#ifndef HTTPWINDOW_H
#define HTTPWINDOW_H

#include <QDialog>
#include <QNetworkAccessManager>
#include <QUrl>

class QDialogButtonBox;
class QFile;
class QLabel;
class QLineEdit;
class QProgressDialog;
class QPushButton;
class QSslError;
class QAuthenticator;
class QNetworkReply;


class HttpWindow : public QDialog
{
	Q_OBJECT

public:
	HttpWindow(std::string uri, QWidget *parent = 0);

	void startRequest(QUrl url);

private slots:
	void downloadFile();
	void cancelDownload();
	void httpFinished();
	void httpReadyRead();
	void updateDataReadProgress(qint64 bytesRead, qint64 totalBytes);

private:
	QLabel *statusLabel;
	QProgressDialog *progressDialog;
	QPushButton *downloadButton;
	QPushButton *cancelButton;
	QDialogButtonBox *buttonBox;

	QUrl url;
	QNetworkAccessManager qnam;
	QNetworkReply *reply;
	QFile *file;
	int httpGetId;
	bool httpRequestAborted;
};

#endif

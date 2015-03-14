/*
  JDokan : Java library for Dokan

  Copyright (C) 2008 Yu Kobayashi http://yukoba.accelart.jp/

  http://decas-dev.net/en

This program is free software; you can redistribute it and/or modify it under
the terms of the GNU Lesser General Public License as published by the Free
Software Foundation; either version 3 of the License, or (at your option) any
later version.

This program is distributed in the hope that it will be useful, but WITHOUT ANY
WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

You should have received a copy of the GNU Lesser General Public License along
with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package net.decasdev.dokan;

public class DokanOperationException extends Exception {
	private static final long serialVersionUID = -2759529773077624821L;

	/** Usually you should return GetLastError() */
	public int errorCode;
    private WinError error;

	public DokanOperationException(WinError error) {
		this.errorCode = error.getValue();
        this.error = error;
	}

    public String toString()
    {
        return this.error.toString();
    }
}
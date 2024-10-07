package me.rinelfi.model;

import java.util.Date;

public class DownloadFile {
	private Category _category;
	private String _name;
	private String _path;
	private String _address;
	private String _referer;
	private String _cookies;
	private String _header;
	private long _date;
	private long _size;
	private int _progress;
	private Status _status;
	
	public DownloadFile() {
		this.category(Category.ALL)
				.name(null)
				.path(null)
				.address(null)
				.referer(null)
				.cookies(null)
				.header(null)
				.date(0)
				.size(0)
				.progress(0)
				.status(Status.WAITING);
	}
	public DownloadFile category(Category category) {
		this._category = category;
		return (this);
	}
	public Category category() {
		return (this._category);
	}
	public DownloadFile name(String name) {
		this._name = name;
		return (this);
	}
	public String name() {
		return (this._name);
	}
	public DownloadFile path(String path) {
		this._path = path;
		return (this);
	}
	public String path() {
		return (this._path);
	}
	public DownloadFile referer(String referer) {
		this._referer = referer;
		return (this);
	}
	public String referer() {
		return (this._referer);
	}
	public DownloadFile cookies(String cookies) {
		this._cookies = cookies;
		return (this);
	}
	public String cookies() {
		return (this._cookies);
	}
	public DownloadFile header(String header) {
		this._header = header;
		return (this);
	}
	public String header() {
		return (this._header);
	}
	public DownloadFile address(String address) {
		this._address = address;
		return (this);
	}
	public String address() {
		return (this._address);
	}
	public DownloadFile date(long date) {
		this._date = date;
		return (this);
	}
	public DownloadFile date(Date date) {
		this._date = date.getTime();
		return (this);
	}
	public long date() {
		return (this._date);
	}
	public DownloadFile size(long size) {
		this._size = size;
		return (this);
	}
	public long size() {
		return (this._size);
	}
	public DownloadFile progress(int progress) {
		this._progress = progress;
		return (this);
	}
	public int progress() {
		return (this._progress);
	}
	public DownloadFile status(Status status) {
		this._status = status;
		return (this);
	}
	public Status status() {
		return (this._status);
	}
}
